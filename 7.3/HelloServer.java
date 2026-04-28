import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Hello Server is ready...");

        while (true) {
            try (Socket socket = server.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String name = in.readLine();
                String response = "Hello " + name;

                out.println(response);
            }
        }
    }
}
