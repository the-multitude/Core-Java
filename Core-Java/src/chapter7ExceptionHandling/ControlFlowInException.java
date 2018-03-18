package chapter7ExceptionHandling;

public class ControlFlowInException {

	public static void main(String[] args) {
		
		try {
			//statement 1;
			//statement 2;
			//statement 3;
		}
		
		catch (Exception e) {
			//statement 4;
		}
		
		//statement 5;
		
	}

}

/*
 
 Control Flow in try-catch :
 
 	Case 1:
 		If there is no exception in 1,2,3 and 5 statements then it's a normal terminations (catch won't be executed as there is no exception has raised).
 		
 	Case 2:
 		If the exception raised at statement 2 and corresponding catch block matched then it's a normal termination
 		
 	Case 3:
 		If the exception raised at statement 2 and corresponding catch block not matched then after statement 1 it's an abnormal termination.
 		
 	Case 4:
 		If the exception raised at statement 4 and 5 it's always an abnormal termination.

 Note:
 		* Within in the Try block if any where an exception raises then rest of the try block won't be executed
 	even though the exception has been handled. So it's recommended to take only the risky code in try block and
 	length of the code in try block should be as less as possible.
 	
 		* If an exception raised at any statement which is not part of try block then it's always an abnormal
 	termination.
 
 */
