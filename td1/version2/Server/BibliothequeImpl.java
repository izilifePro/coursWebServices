import java.rmi.*;
import java.rmi.server.*; 
import java.util.*;
import java.util.Map.Entry; 

public class BibliothequeImpl extends UnicastRemoteObject implements Bibliotheque{
	public HashMap<Integer, Book> books; 
	public BibliothequeImpl() throws RemoteException {
		super();
		books = new HashMap<Integer, Book>(); 
	}

	public void add(int isbn, String titre, String auteur) throws RemoteException{
		Book b = new Book(isbn, titre, auteur); 
		books.put(new Integer(isbn), b); 
	}
	public void delete(int isbn) throws RemoteException{
		books.remove(new Integer(isbn));
	}
	public List<Book> findTitre(String titre) throws RemoteException{
		List bookList = new ArrayList<Book>();
		for(Entry<Integer, Book> entry : books.entrySet()){
			Integer isbn = entry.getKey(); 
			Book b = entry.getValue();
			if(b.getTitre().equals(titre)){
				bookList.add(b);
			}		
		}
		return bookList;
	}
	public List<Book> findAuteur(String auteur) throws RemoteException{
	System.out.println(books.size());		
	List bookList = new ArrayList<Book>();
		for(Entry<Integer, Book> entry : books.entrySet()){
			Integer isbn = entry.getKey(); 
			Book b = entry.getValue();
			if(b.getAuteur().equals(auteur)){
				bookList.add(b);
			}		
		}
		return bookList;
	}
}
