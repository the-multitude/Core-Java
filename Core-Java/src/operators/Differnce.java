package operators;

public class Differnce {
	/**
	  Difference between a++ and a = a + 1
	 */
	public static void main(String[] args) {
		
		// Case 1:
		
		byte a = 10;
		System.out.println(++a);
		
		// Case 2:
		
		byte b = 10;
		//System.out.println(b = b + 1); // C.E - incompatible types: possible lossy conversion from int to byte

		// Case 3:
		
		byte c = 10;
		c = (byte) (c + 1);
		System.out.println(c);
		
		
	/**
	 Explanation:
	 	Whenever we are performing any arithmetic operations between two variables of a and b result is always
	 					max(int , type of a , type of b)
	 					
	 					b ++ --> b = (type of b) (b +1 ); (Internal type casting performed by compiler)
	 					eg: byte b++ --> b = (byte b) (b +1 );  
	 	
	 	
	 */
		
		
	}

}
