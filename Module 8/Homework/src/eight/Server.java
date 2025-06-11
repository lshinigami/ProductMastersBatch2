package eight;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Server {
    private static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private static ScheduledFuture<?> timeout;

    private static HashMap<String, String> users = new HashMap<>();

    private static void scheduleTimeout(Socket socket) {
        if (timeout != null && !timeout.isDone()) {
            timeout.cancel(true);
        }

        timeout = scheduler.schedule(() -> {
            System.out.println("\nServer: client is inactive for a 30 seconds. Disconnecting...");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, 30, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        Server.users.put("user1", "1234");

        int port = 7182;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is running, waiting for connection...");
            while(true) {
                try (Socket client = serverSocket.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));)
                {
                    System.out.println("Client connected " + client.getInetAddress());

                    String login = in.readLine();
                    String password = in.readLine();

                    if (Server.users.containsKey(login) && Server.users.get(login).equals(password)) {
                        out.println("Welcome, " + login + "!");
                    } else {
                        out.println("Incorrect login or password");
                        client.close();
                        return;
                    }

                    scheduleTimeout(client);
                    String clientMsg;
                    String serverMsg;

                    while (true) {
                        System.out.println("Client: enter login");
                        clientMsg = in.readLine();
                        scheduleTimeout(client);
                        System.out.println("Client: " + clientMsg);

                        if (Objects.isNull(clientMsg) || clientMsg.equalsIgnoreCase("exit")) {
                            System.out.println("Client disconnected " + client.getInetAddress());
                        }
                        else if (clientMsg.equalsIgnoreCase("/time")) {
                            System.out.println("Server: " + LocalTime.now());
                        }

                        System.out.println("Server: ");
                        serverMsg = consoleInput.readLine();
                        out.println(serverMsg);

                        if (serverMsg.equalsIgnoreCase("exit")) {
                            System.out.println("Disconnecting...");
                            break;
                        }
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
