import java.io.*;
import java.net.*;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        System.out.println("Add:      " + call("add 10 5"));
        System.out.println("Subtract: " + call("subtract 10 5"));
        System.out.println("Multiply: " + call("multiply 10 5"));
        System.out.println("Divide:   " + call("divide 10 5"));
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
