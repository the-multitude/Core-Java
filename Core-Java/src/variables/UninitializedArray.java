package variables;

public class UninitializedArray {

	int[] notInit;
	int[] init = new int[5];


	public static void main(String[] args) {

		UninitializedArray tmp = new UninitializedArray();

		System.out.println(tmp.notInit); // Output: null
		System.out.println(tmp.init); // Output: [I@XXXXXX

		//System.out.println(tmp.notInit[0]); // R.E - Exception in thread "main" java.lang.NullPointerException
		System.out.println(tmp.init[0]); // Output: 0

		/*
		 
		 int[] notInit -> array reference is created but not initialized. So JVM provides null value
		 int[] init = new int[5]; -> Here with new operator we are creating an object because of that JVM provide
		 							 default value '0'

		 * Once an array is created and initialized, JVM provide default values to static array or instance array
		    or local array.


		 */



	}

}
