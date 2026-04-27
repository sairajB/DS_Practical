import java.rmi.*;

public class AddServer {
    public static void main(String[] args) {
        try {
            AddServerImpl obj = new AddServerImpl();
            Naming.rebind("AddServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}