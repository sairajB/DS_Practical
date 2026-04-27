import java.rmi.*;

public class AddClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/AddServer";
            AddServerIntf obj = (AddServerIntf) Naming.lookup(url);
            
            double d1 = 10, d2 = 20;
            System.out.println("First Number: " + d1);
            System.out.println("Second Number: " + d2);
            System.out.println("Sum: " + obj.add(d1, d2));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}