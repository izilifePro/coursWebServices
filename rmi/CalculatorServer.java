import java.rmi.Naming;

public class CalculatorServer{

	public static void main(String[] args){		
		try {
		    CalculatorImpl calc.ulator = new CalculatorImpl();
		    Naming.rebind("rmi://localhost:1099/CalculatorService", calculator);
		    
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.getMessage());		 
		}
	}
}
