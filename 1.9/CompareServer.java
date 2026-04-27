import java.rmi.*;

public class CompareServer {
    public static void main(String[] args) {
        try {
            CompareServerImpl obj = new CompareServerImpl();
            Naming.rebind("CompareServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
