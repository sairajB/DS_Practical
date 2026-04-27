import java.rmi.*;
import java.rmi.server.*;

public class EchoServerImpl extends UnicastRemoteObject implements EchoServerIntf {

    public EchoServerImpl() throws RemoteException {}

    public String echo(String name) throws RemoteException {
        return "Hello " + name;
    }
}
