import java.rmi.*;

public class MilesServer {
    public static void main(String[] args) {
        try {
            MilesServerImpl obj = new MilesServerImpl();
            Naming.rebind("MilesServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
