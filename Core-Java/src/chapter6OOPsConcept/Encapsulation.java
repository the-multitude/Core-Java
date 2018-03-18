package chapter6OOPsConcept;

/**
 Encapsulation:
 	Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods)
 together as a single unit.

 				Encapsulation = Data Hiding + Abstraction
 *To achieve encapsulation:

	->	Declare the variables of a class as private.

	->	Provide public setter and getter methods to modify and view the variables values.

 */



public class Encapsulation {

	private double balanceAmount = 540000.00;

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

}
