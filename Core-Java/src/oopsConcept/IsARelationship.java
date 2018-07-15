package oopsConcept;

/**
 Is-a-Relationship:
 
 * IS A relationship means you inherit and extend the functionality of the Parent class.
 
 * It is also known as Inheritance.
 
 * By using "extends" keyword we can implement is-a-relationship.
 
 * Advantage : Re-usability of code.
 
 */

class Parent {

	public void m1() {}

}

class Child extends Parent {

	public void m2 () {}

}

public class IsARelationship {

	public static void main(String[] args) {
		
		// Case 1:
		
		Parent parentRef = new Parent();
			parentRef.m1();
			//parentRef.m2(); // C.E - cannot find symbol parentRef.m2();
									 // 	symbol:   method m2()
			  						//		location: variable parentRef of type Parent
		
		
		// Case 2:
			
			Child childRef = new Child();
				childRef.m1();
				childRef.m2();
				
				
		// Case 3:
				
				Parent parentReference = new Child();
					parentReference.m1();
					//parentReference.m2(); // C.E - cannot find symbol parentReference.m2();
										//	symbol:   method m2()
										//	location: variable parentReference of type Parent
					
		// Case 4:
					
				//Child chRef = new Parent (); // C.E - incompatible types: Parent cannot be converted to Child
		
	/*
	Conclusion:
	
	1. What ever the parent class has, by default it will be available to child class. So with child class
	reference we can call both parent and child class methods.
	
	2. What ever the child class has, will not be available to parent class. So on the parent reference
	we can call only parent class methods (we can't call child specific methods).
	
	3. Parent class reference is used to hold child class objects by using that reference we can only parent class
	methods but not child specific methods
	
	4. We can't use child class reference to hold parent class objects.
	
	 */
		

	}

}
