import java.rmi.*;

public class PowerServer {
    public static void main(String[] args) {
        try {
            PowerServerImpl obj = new PowerServerImpl();
            Naming.rebind("PowerServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
