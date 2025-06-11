package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Client {
    private static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private static ScheduledFuture<?> timeout;

    private static void scheduleTimeout(Socket socket) {
        if (timeout != null && !timeout.isDone()) {
            timeout.cancel(true);
        }

        timeout = scheduler.schedule(() -> {
            System.out.println("\nClient: server is inactive for a 30 seconds. Disconnecting...");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, 30, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        String serverAdress = "127.0.0.1";
        int port = 7182;

        try (Socket socket = new Socket(serverAdress, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));)
        {
            System.out.println("Connecting...");

            System.out.print("Client: Enter login: ");
            String login = consoleInput.readLine();
            out.println(login);

            System.out.print("Client: Enter password: ");
            String password = consoleInput.readLine();
            out.println(password);

            String authResponse = in.readLine();
            System.out.println("Сервер: " + authResponse);

            if (!authResponse.startsWith("Welcome")) {
                System.out.println("Authentication failed. Disconnecting...");
                return;
            }

            scheduleTimeout(socket);

            String clientMsg;
            String serverMsg;

            while (true) {
                System.out.println("Client: ");
                clientMsg = consoleInput.readLine();
                out.println(clientMsg);

                scheduleTimeout(socket);

                if(clientMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected " + socket.getInetAddress());
                    break;
                }

                serverMsg = in.readLine();
                if (Objects.isNull(serverMsg) || serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("Disconnecting...");
                    break;
                }
                System.out.println("Server message: " + serverMsg);
                scheduleTimeout(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scheduler.shutdown();
        }
    }
}
