import java.rmi.*;

public class VowelClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/VowelServer";
            VowelServerIntf obj = (VowelServerIntf) Naming.lookup(url);

            String word = "hello";
            System.out.println("Word: " + word);
            System.out.println("Number of vowels: " + obj.countVowels(word));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
