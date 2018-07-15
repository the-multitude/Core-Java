package chapter3FlowControl;

/**
 * @author Madhan
 *
 */

public class IfElse {

	public static void main(String[] args) {

		// Arguments to the "if" statement should be boolean type.


		/* Case 1:
			
		int x = 0;
			
		 if (x) // C.E - incompatible types: int cannot be converted to boolean
		{
			//System.out.println("If executed");
		}

		else {
			//System.out.println("Else executed");
		}
		 */	

		// *******************************************************//
		
		
		// Case 2:
		
		boolean b = false;
		
		if (b= true) {
			System.out.println("If executed");
		}
		
		else {
			System.out.println("Else executed");
		}
		// Output: If executed
		
		// *******************************************************//
		
		// Case 3:
		
		boolean c = false;
		
		if (c == true) {
			System.out.println("If executed");
		}
		
		else {
			System.out.println("Else executed");
		}
		// Output : Else executed
		
		// *******************************************************//
		

		/* Case 4:
		
		int x = 10;
		
		 if (x=20) // C.E - incompatible types: int cannot be converted to boolean
		{
			//System.out.println("If executed");
		}

		else {
			//System.out.println("Else executed");
		}
		 */	
		
		// Case 5:
		
		int x = 20;
		
		 if (x==20)
		{
			System.out.println("If executed");
		}

		else {
			System.out.println("Else executed");
		}
		
	}

}
