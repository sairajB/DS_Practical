import java.io.*;
import java.net.*;

public class SimpleInterestClient {
    public static void main(String[] args) throws Exception {
        System.out.println("Simple Interest for P=1000, R=5, T=2: " + call("1000 5 2"));
        System.out.println("Simple Interest for P=5000, R=4, T=3: " + call("5000 4 3"));
        System.out.println("Simple Interest for P=2000, R=6, T=1: " + call("2000 6 1"));
    }

    static String call(String request) throws Exception {
        try (Socket socket = new Socket("localhost", 8080);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            out.println(request);
            return in.readLine();
        }
    }
}
