import java.rmi.*;

public interface CelsiusServerIntf extends Remote {
    double toFahrenheit(double celsius) throws RemoteException;
}
