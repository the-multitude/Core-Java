package exceptionHandling;

public class PrintExceptions {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		
		catch (Exception e) {
			
			e.printStackTrace(); // prints name of the exception, description and stack trace
			
			System.out.println(e); // prints name of the exception and description
			//or
			System.out.println(e.toString()); // prints name of the exception and description
					
			e.getMessage(); // prints only the description
			
		// Note: Default exception handler internally uses "printStackTrace()"
			
		}
	}

}
