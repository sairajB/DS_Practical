import java.io.*;
import java.net.*;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        System.out.println(call("Alice"));
        System.out.println(call("Bob"));
        System.out.println(call("Charlie"));
    }

    static String call(String name) throws Exception {
        try (Socket socket = new Socket("localhost", 8080);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            out.println(name);
            return in.readLine();
        }
    }
}
