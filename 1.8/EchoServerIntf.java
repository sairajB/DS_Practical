import java.rmi.*;

public interface EchoServerIntf extends Remote {
    String echo(String name) throws RemoteException;
}
