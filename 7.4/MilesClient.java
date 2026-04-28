import java.io.*;
import java.net.*;

public class MilesClient {
    public static void main(String[] args) throws Exception {
        System.out.println("10 Miles = " + call("10") + " km");
        System.out.println("50 Miles = " + call("50") + " km");
        System.out.println("100 Miles = " + call("100") + " km");
    }

    static String call(String miles) throws Exception {
        try (Socket socket = new Socket("localhost", 8080);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            out.println(miles);
            return in.readLine();
        }
    }
}
