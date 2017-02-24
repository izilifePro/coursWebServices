import java.rmi.Naming;

public class BiblioServer{

	public static void main(String[] args){		
		try {
		    Bibliotheque biblio = new BibliothequeImpl();
		    Naming.rebind("rmi://localhost:1099/BibliothequeService", biblio);
		    
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.getMessage());		 
		}
	}
}
