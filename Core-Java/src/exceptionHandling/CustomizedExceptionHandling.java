package exceptionHandling;

/*
 Customized exception handling:
 	Risky code should be maintained in try and corresponding handling code inside catch block.
 	
 		eg:		try{
 					risky code
 				   }
 				Catch (xxxxxx e) {
 				   	handling code
 				   	}
  
 */


public class CustomizedExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Statement 1");
		
		try {
			System.out.println(10/0); // raises arithmetic exception and control moves to catch block
		}
		
		catch (Exception e) {
			e.printStackTrace(); // prints name of the exception, description and stack trace
			System.out.println(10/2); // alternative code is mentioned in catch block
		}
		
		System.out.println("Statement 3");

	}

}
