package variables;

/**
Local Variable:

* To meet the temporary requirement local variables are created. Local variables are created inside a method
    or block or constructor.

* Local variables are created when executing that block of code and destroyed once the block gets completed.
     Scope of the variable is exactly same as that block.

* For local variables, JVM won't provide default values, we should provide the values explicitly before using
    that variable



 */


public class LocalVariables {

	public static void main(String[] args) {
		
		int i = 0;
		
		for (int j=0; j< 3; j++) {
			
			i = i+j;
		}
		
		// System.out.println(i +"        "+j ); // Compile Error -  cannot find symbol symbol: variable j location: class LocalVariables
																					
	}

}
