import java.rmi.*;

public class CelsiusClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/CelsiusServer";
            CelsiusServerIntf obj = (CelsiusServerIntf) Naming.lookup(url);

            double celsius = 25;
            System.out.println("Celsius: " + celsius);
            System.out.println(celsius + "°C to Fahrenheit = " + obj.toFahrenheit(celsius) + "°F");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
