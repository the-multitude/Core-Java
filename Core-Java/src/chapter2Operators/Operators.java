package chapter2Operators;

public class Operators {

	public static void main(String[] args) {
		
	// Case 1: Only for variables increment/decrement operator is applicable not for constants
		
		int x = 5;
		int y = ++ x;
		//int z = ++4; // C.E - unexpected type 	required: variable   found: value
		  							
		
	// Case 2: Nesting of increment/decrement operator is not allowed
		
		//int a = ++ (++x); // C.E - unexpected type   found: value 	required: variable
		
	// Case 3: Increment/decrement is not applicable for final variable
		
		final int tmp = 5;
		// ++tmp;	// C.E - cannot assign a value to final variable tmp
		
	// Case 4: Increment/decrement is applicable for every primitive type except for boolean
		
		char ch = 'a';
		System.out.println(++ch); // Output : b
		
		double d = 10.5;
		System.out.println(++d); // Output : 11.5
		
		boolean b = true;
		//System.out.println(++b); // C.E - bad operand type boolean for unary operator '++'
		
	}

}
