import java.rmi.*;

public interface Observe extends Remote{
	public void subscribe(Observateur obs) throws RemoteException; 
	public void unsubscribe(Observateur obs) throws RemoteException; 
}
