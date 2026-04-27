import java.rmi.*;

public interface CompareServerIntf extends Remote {
    String compareLargest(String s1, String s2) throws RemoteException;
}
