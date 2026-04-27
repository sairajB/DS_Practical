import java.rmi.*;

public interface FactorialServerIntf extends Remote {
    long factorial(int n) throws RemoteException;
}
