import java.rmi.*;
import java.rmi.server.*;

public class CelsiusServerImpl extends UnicastRemoteObject implements CelsiusServerIntf {

    public CelsiusServerImpl() throws RemoteException {}

    public double toFahrenheit(double celsius) throws RemoteException {
        return (celsius * 9/5) + 32;
    }
}
