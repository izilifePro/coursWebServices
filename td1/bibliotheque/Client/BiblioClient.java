import java.rmi.*;
import java.rmi.registry.*;
import java.util.List;
import java.net.*;

public class BiblioClient{

	public static void main(String[] args){		
		try {
		    String codeBase = "file:///users/nianse15/Bureau/coursWebServices/td1/bibliotheque/Client/";
		    System.setProperty("java.rmi.server.codebase", codeBase);
		    System.setProperty("java.security.policy", "security.policy"); 
		    System.setSecurityManager(new RMISecurityManager());

		    Bibliotheque biblio = (Bibliotheque) Naming.lookup("rmi://localhost:1099/BibliothequeService");
		    biblio.add(1, "Nommade", "Cheikh Anta DIOP");
		    biblio.add(2, "L'enfant noir", "Camara LAYE");
		    biblio.add(3, "Une si longue lettre", "Mariame BA");
		    biblio.add(4, "Le ventre de l'atlantique", "Fatou DIOME");
		    biblio.add(5, "La crise de 2008", "Jacques ATTALI");
		    biblio.add(6, "Toto tape pathe", "Ben Omar");
		    
		    List<Book> list = biblio.findTitre("Fatou DIOME");	    
		    System.out.println("Fatou DIOME a écrit "+ list);				    
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.getMessage());		 
		}
	}
}
