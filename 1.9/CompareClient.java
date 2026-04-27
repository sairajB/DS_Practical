import java.rmi.*;

public class CompareClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/CompareServer";
            CompareServerIntf obj = (CompareServerIntf) Naming.lookup(url);

            String s1 = "apple";
            String s2 = "zebra";
            System.out.println("String 1: " + s1);
            System.out.println("String 2: " + s2);
            System.out.println("Lexicographically Largest: " + obj.compareLargest(s1, s2));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
