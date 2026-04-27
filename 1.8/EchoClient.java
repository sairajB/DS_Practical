import java.rmi.*;

public class EchoClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/EchoServer";
            EchoServerIntf obj = (EchoServerIntf) Naming.lookup(url);

            String name = "World";
            System.out.println("Name: " + name);
            System.out.println("Output: " + obj.echo(name));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
