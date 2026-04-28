import java.io.*;
import java.net.*;

public class MilesServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Miles to Kilometers Server is ready...");

        while (true) {
            try (Socket socket = server.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String request = in.readLine();
                double miles = Double.parseDouble(request);

                double kilometers = miles * 1.60934;

                out.println(kilometers);
            }
        }
    }
}
