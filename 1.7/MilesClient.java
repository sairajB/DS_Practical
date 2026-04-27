import java.rmi.*;

public class MilesClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/MilesServer";
            MilesServerIntf obj = (MilesServerIntf) Naming.lookup(url);

            double miles = 10;
            System.out.println("Miles: " + miles);
            System.out.println(miles + " miles to kilometer = " + obj.toKilometer(miles) + " km");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
