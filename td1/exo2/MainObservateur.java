import java.rmi.Naming;

public class MainObservateur{

	public static void main(String[] args){		
		try {

		    Naming.rebind("rmi://localhost:1099/ObservateurService", biblio);
		    
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.getMessage());		 
		}
	}
}
