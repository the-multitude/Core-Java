package oopsConcept;

/*
 Over loading:

 * Two methods are said to be overloaded if both the method names are same but arguments are different.

 * Over loading is also known as "compile time Polymorphism" or "Static Polymorphism" or "early binding".

 */
public class Overloading {

	public void m1(StringBuffer sb) {
		System.out.println("Stringbuffer arg executed");	
	}

	public void m1(String s) {
		System.out.println("String arg executed");
	}

	public void m1(Object o) {
		System.out.println("Object arg executed");
	}

	public void m1(long l) {
		System.out.println("Long arg executed");
	}

	public static void main(String[] args) {

		Overloading ovr = new Overloading();

		/* Case 1: Automatic promotion in overloading.

		 * In overloading method resolution, if the method with specified argument type is not available then compiler
	 won't raise exception immediately. It promotes that argument to next level and checks for matched method.

		 * This process will be continued until all possible promotions are matches. Still if not found the match
	 then only compiler will raise exception.

		 */

		// integer value is passed 
		ovr.m1(21); // Output: Long arg executed
		//ovr.m1(10.50);// if argument not matched. C.E - no suitable method found for m1(double)

		// Case 2: In over loading more specific version will get high priority.

		ovr.m1(new StringBuffer("Multitude")); // Output: Stringbuffer arg executed
		ovr.m1("Core-Java"); // Output: String arg executed
		//ovr.m1(null); // null is a default value for both String and StringBuffer. C.E - reference to m1 is ambiguous

		// Case 3: In over loading child argument will get high priority than parent argument (Object class is a parent class of String Class)
		
		ovr.m1("Java"); // Output: String arg executed
		ovr.m1(new Object());// Output: Object arg executed

	}

}
