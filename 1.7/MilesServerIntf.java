import java.rmi.*;

public interface MilesServerIntf extends Remote {
    double toKilometer(double miles) throws RemoteException;
}
