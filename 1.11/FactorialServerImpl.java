import java.rmi.*;
import java.rmi.server.*;

public class FactorialServerImpl extends UnicastRemoteObject implements FactorialServerIntf {

    public FactorialServerImpl() throws RemoteException {}

    public long factorial(int n) throws RemoteException {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
