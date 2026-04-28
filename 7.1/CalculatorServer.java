import java.io.*;
import java.net.*;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server is ready...");

        while (true) {
            try (Socket socket = server.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String request = in.readLine();
                String[] parts = request.split(" ");

                String operation = parts[0];
                int a = Integer.parseInt(parts[1]);
                int b = Integer.parseInt(parts[2]);

                int result = switch (operation) {
                    case "add" -> a + b;
                    case "subtract" -> a - b;
                    case "multiply" -> a * b;
                    case "divide" -> (b != 0) ? a / b : 0;
                    default -> 0;
                };

                out.println(result);
            }
        }
    }
}
