package eight;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleHttpServer {
    public static void main(String[] args) {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(8081), 0);
            httpServer.createContext("/", exchange -> {
                Path filePath = Path.of("hello.html");
                if (Files.exists(filePath)) {
                    String htmlContent = Files.readString(filePath);
                    exchange.getResponseHeaders().add("Content-Type", "text/html");
                    exchange.sendResponseHeaders(200, htmlContent.getBytes().length);
                    try (OutputStream outputStream = exchange.getResponseBody()){
                        outputStream.write(htmlContent.getBytes());
                    }
                } else {
                    String msg = "NOT FOUND";
                    try (OutputStream outputStream = exchange.getResponseBody()){
                        outputStream.write(msg.getBytes());
                    }
                }
            });
            httpServer.start();
            System.out.println("Server started");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
