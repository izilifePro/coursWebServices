import java.rmi.*;

public class CalculatorClient{

	public static void main(String[] args){		
		try {
		    String codeBase = "file:///users/nianse15/Bureau/rmiEvolue/Server/";
		    System.setProperty("java.rmi.server.codebase", codeBase);
		    System.setProperty("java.security.policy", "security.policy"); 
		    System.setSecurityManager(new RMISecurityManager());
		    Calculator c = (Calculator) Naming.lookup("rmi://localhost:1099/CalculatorService");
		    System.out.println(c.sub(4,3));
		    System.out.println(c.add(8,4));
		    System.out.println(c.mul(4,6));
		    System.out.println(c.div(45,3));
		    
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.getMessage());		 
		}
	}
}
