package exceptionHandling;

/*
 Finally :
 	
 	* The main purpose of the finally block is to maintain clean up codes which should be executed always.
 	 
 	* It is never recommend to maintain clean up code in try or catch block.
 	
 	* Whether the exception has raised or not , whether the code has been handled or not, finally block always
 	  gets executed.
 	  
 	* There is only one situation where finally block won't be executed is when ever the jvm shuts down (If you invoke System.exit(0)))
 
 
 
 */

public class FinallyBlock {

	public static void main(String[] args) {
		
		// Case 1 : No exception has raised
		
		try {
			System.out.println("Try block executed");
		}
		
		catch (NullPointerException e) {
			System.out.println("Catch block executed");
		}
	
		finally {
			System.out.println("Finally block executed");
		}
	
		// Output : Try block executed
		//			Catch block executed
	
		// Case 2: Exception has raised and it's been handled.
		
		try {
			System.out.println("Try block executed");
			System.out.println(10/0);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Catch block executed");
		}
	
		finally {
			System.out.println("Finally block executed");
		}
	
		// Output : Try block executed
		// 			Catch block executed
		// 			Finally block executed
		
		// Case 3: Exception has raised and it's not been handled.
		
		try {
			System.out.println("Try block executed");
			System.out.println(10/0);
		}
	
		catch (NullPointerException e) {
			System.out.println("Catch block executed");
		}
		
		finally {
			System.out.println("Finally block executed");
		}
	
		// Output: Try block executed
		//		   Finally block executed
		// 		   Abnormal Termination
	
	}
	
}
