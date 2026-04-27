import java.rmi.*;

public class PowerClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/PowerServer";
            PowerServerIntf obj = (PowerServerIntf) Naming.lookup(url);

            double d1 = 5;
            System.out.println("Number: " + d1);
            System.out.println("2 to the power of " + d1 + " = " + obj.power(d1));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
