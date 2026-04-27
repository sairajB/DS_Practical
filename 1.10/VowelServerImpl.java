import java.rmi.*;
import java.rmi.server.*;

public class VowelServerImpl extends UnicastRemoteObject implements VowelServerIntf {

    public VowelServerImpl() throws RemoteException {}

    public int countVowels(String word) throws RemoteException {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
