package operators;

public class InstanceofOperator {
	
	/**
	 Instance of operator : (instanceof)
	  	Using this operator we can check, whether the given object is particular type or not.
	  	Result: Boolean value.
	  			eg: r instanceof x
	  				where r is any reference type
	  					  x is of class / interface		  
	 */

	public static void main(String[] args) {
		
		Thread t1  = new Thread();
		
		System.out.println(t1 instanceof Thread); // Output : true
		System.out.println(t1 instanceof Object); // Output : true
		System.out.println(t1 instanceof Runnable); // Output : true
		
		// If there is no relation
		//System.out.println(t1 instanceof String); // C.E - incompatible types: Thread cannot be converted to String
		
		// Whenever we are checking parent object is of child object, then we will get false as output
		
		Object o = new Object();		
		System.out.println(o instanceof String); // Output : false

	}

}
