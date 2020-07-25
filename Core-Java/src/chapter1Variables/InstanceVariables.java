package chapter1Variables;

/**
 * 
 * @author Madhan
 * 
 * Instance Variable:
 *	
 * 		If the value of a variable varied from object to object such types of variables are 
 *	  	called "Instance Variables"
 *
 * 		For every object a separate copy of instance variable will be created.So performing any changes to 
 *    	instance variables, it will not be reflected to other objects.
 *
 * 		The scope of instance variables is same as the scope of the objects, because instance variable
 *	  	will be created at the time of object creation and destroyed at the time of objects destruction
 *
 * 		Instance variable should be declared within the class but outside of any method or block or constructor
 *
 * 		Instance variable cannot be accessed from static area directly but it can be accessed by object reference
 *
 * 		From instance area we can directly access instance members
 *
 * 		For instance variable it is not required to initializes explicitly, JVM will provide default values
 *
 */

public class InstanceVariables {

	int x = 10;
	String s;
	int k;
	boolean b;

	public static void main(String[] args) {
		
		//System.out.println(x); // Compile error - non-static variable x cannot be referenced from a static context
		
		/*
		 * A static method cannot access a class’s instance variables and instance methods, 
		 * because a static method can be called even when no objects of the class have been instantiated. 
		 * For the same reason, the this reference cannot be used in a static method.
		 * The this reference must refer to a specific object of the class, and when a static method is called, 
		 * there might not be any objects of its class in memory.
		 */
		
		InstanceVariables var = new InstanceVariables();
		System.out.println(var.x); //Output: 10 - through object we can access instance variable from static area

		// for instance variable it is not required to initializes explicitly, JVM will provide default values

		System.out.println(var.s); // Output : null
		System.out.println(var.k); // Output : 0
		System.out.println(var.b); // Output: false

	}

	public void method() {
		System.out.println(x); // instance variable can be directly access from instance area
	}

}
