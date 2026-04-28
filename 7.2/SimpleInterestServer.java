import java.io.*;
import java.net.*;

public class SimpleInterestServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Simple Interest Server is ready...");

        while (true) {
            try (Socket socket = server.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String request = in.readLine();
                String[] parts = request.split(" ");

                double principal = Double.parseDouble(parts[0]);
                double rate = Double.parseDouble(parts[1]);
                double time = Double.parseDouble(parts[2]);

                double simpleInterest = (principal * rate * time) / 100;

                out.println(simpleInterest);
            }
        }
    }
}
