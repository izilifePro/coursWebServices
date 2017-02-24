import java.rmi.*;
import java.util.List; 

public interface Bibliotheque extends Remote{
	public void add(int isbn, String titre, String auteur) throws RemoteException;
	public void delete(int isbn) throws RemoteException;
	public List<IBook> findAuteur(String titre) throws RemoteException;
	public List<IBook> findTitre(String auteur) throws RemoteException;
}
