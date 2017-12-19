package oopsConcept;

/*
 Has-A-Relationship:
   
  * Has-A-Relationship is also known as "Aggregation" or "Composition"
  
  * There is no specific keyword to implement has-a-relationship, but mostly "new" keyword is used.
    
 */


class Engine {
	
}

class Car{
	
	Engine e = new Engine(); // Class car has engine reference.	
	
}

public class HasARelationship {

	Car cr = new Car(); // Class HasARelationship has car reference.
	
}
