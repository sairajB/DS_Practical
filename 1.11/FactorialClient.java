import java.rmi.*;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/FactorialServer";
            FactorialServerIntf obj = (FactorialServerIntf) Naming.lookup(url);

            int n = 5;
            System.out.println("Number: " + n);
            System.out.println("Factorial of " + n + " = " + obj.factorial(n));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
