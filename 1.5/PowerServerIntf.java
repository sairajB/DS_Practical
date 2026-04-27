import java.rmi.*;

public interface PowerServerIntf extends Remote {
    double power(double d1) throws RemoteException;
}
