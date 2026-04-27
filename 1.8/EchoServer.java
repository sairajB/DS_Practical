import java.rmi.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            EchoServerImpl obj = new EchoServerImpl();
            Naming.rebind("EchoServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
