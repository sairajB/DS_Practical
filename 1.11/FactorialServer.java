import java.rmi.*;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            FactorialServerImpl obj = new FactorialServerImpl();
            Naming.rebind("FactorialServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
