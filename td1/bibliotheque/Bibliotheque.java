import java.rmi.*;

public interface Bibliotheque extends Remote{
	public void addBook(int isbn, String titre, String auteur) throws RemoteException;
	public void deleteBook(int isbn) throws RemoteException;
	public Livre findBook(String auteur) throws RemoteException;
}
