package chapter6OOPsConcept;

/**

 * A class is said to be tightly encapsulated class only if every data members of the class are declared as private.

 * If parent class is not tightly encapsulated then no child class is tightly encapsulated.

 */


// Tightly encapsulated

public class TightlyEncapsulatedClass { 

	private double a = 1000000.00;

}

class child001 extends TightlyEncapsulatedClass{ 

	private double b = 5500000.00;
}


// Not Tightly encapsulated

class Account {
	double c = 5500.00;
}

class child002 extends Account {
	private double d = 500.00;
}