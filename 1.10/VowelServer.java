import java.rmi.*;

public class VowelServer {
    public static void main(String[] args) {
        try {
            VowelServerImpl obj = new VowelServerImpl();
            Naming.rebind("VowelServer", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
