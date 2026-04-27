import java.rmi.*;
import java.rmi.server.*;

public class CompareServerImpl extends UnicastRemoteObject implements CompareServerIntf {

    public CompareServerImpl() throws RemoteException {}

    public String compareLargest(String s1, String s2) throws RemoteException {
        return s1.compareTo(s2) > 0 ? s1 : s2;
    }
}
