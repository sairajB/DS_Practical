import java.rmi.*;
import java.rmi.server.*;

public class PowerServerImpl extends UnicastRemoteObject implements PowerServerIntf {

    public PowerServerImpl() throws RemoteException {}

    public double power(double d1) throws RemoteException {
        return Math.pow(2, d1);
    }
}
