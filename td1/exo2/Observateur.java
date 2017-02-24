import java.rmi.*;

public interface Observateur extends Remote{
	public void newValue(int value) throws RemoteException; 
}
