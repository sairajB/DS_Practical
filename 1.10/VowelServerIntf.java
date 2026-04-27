import java.rmi.*;

public interface VowelServerIntf extends Remote {
    int countVowels(String word) throws RemoteException;
}
