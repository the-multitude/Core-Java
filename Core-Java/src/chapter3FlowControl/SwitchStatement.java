package chapter3FlowControl;

/**
 * Switch Statement:
 *
 * 	If several options are possible then it's recommended to use switch statement not if-else
 *
 * 	Every statement in the switch should be under some case or in default.
 *
 * 	From 1.7 version allowed types (corresponding wrapper class) in switch arguments are (Byte, Short, Character,
 *  Integer, enum and String )
 *
 * 	Both Case and Default are optional.
 *
 * 	Duplicate case label are not allowed.
 *
 *	Switch Structure:
 *
 *				eg: switch (expression){
 *
 *						case label:
 *							statement
 *
 *						default:
 *							statement
 *
 *							}
 */

public class SwitchStatement {

	public static void main(String[] args) {

		// Case 1: Data type

		byte b = 10;

		switch (b) {

		}

		/*
		 * Case 1(a):
		 * 
		 * double f = 100.00;
		 *	
		 *	switch (f) { // C.E - incompatible types: possible lossy conversion from double to int
		 *
		 *	} 
		 */

		/*
		 * Case 1 (b) :
		 * 
		 * boolean bool = true;
		 *
		 *	switch (bool) { // C.E - incompatible types: boolean cannot be converted to int
		 *
		 *	} 
		 *	
		 */

		// Case 2: Every case label in switch statement should be within the range of argument type.

		/*	byte a = 10;

			switch (a) {

			case 0:
				System.out.println("0 matched");

			case 10:
				System.out.println("10 matched");

			case 1000: // C.E - incompatible types: possible lossy conversion from int to byte.
					   // Because byte range is from -128 to 127 
				System.out.println("1000 matched");

			}

		 */

		byte i = 10;

		switch (i + 1) // Converted to int type
		{

		case 0:
			System.out.println("0 matched");

		case 10:
			System.out.println("10 matched");

		case 1000: 
			System.out.println("1000 matched");	

		}

		// Case 3: Every case label should be a valid compile time constant, variables are not allowed

		/*	int x = 10;
			int y = 20;

			switch (x) {

			case 10:
				System.out.println("10 macthed");

			case y: // C.E - constant expression required
					// if "y" declared as final then there won't be a compile time error
				System.out.println("20 matched");

			}
		 */	

		// Case 4: Expressions are allowed in both switch argument and case label, but in case label it should be a constant expression

		int c = 10;

		switch (c) {

		case 10:
			System.out.println("10 matched");

		case 10+20:
			System.out.println("30 matched");
		}


		// Case 5: Duplicate case labels are not allowed

		/*	int z = 30;

			switch (z) {

			case 10: // C.E - duplicate case label
				System.out.println("10 matched");

			case 10: // C.E - duplicate case label
				System.out.println("10 matched");
			}

		 */	

	}

}
