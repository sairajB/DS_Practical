import java.rmi.*;
import java.rmi.server.*;

public class MilesServerImpl extends UnicastRemoteObject implements MilesServerIntf {

    public MilesServerImpl() throws RemoteException {}

    public double toKilometer(double miles) throws RemoteException {
        return miles * 1.60934;
    }
}
