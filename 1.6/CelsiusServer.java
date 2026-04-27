import java.rmi.*;

public class CelsiusServer {
    public static void main(String[] args) {
        try {
            CelsiusServerImpl obj = new CelsiusServerImpl();
            Naming.rebind("CelsiusServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
