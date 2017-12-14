package arrays;

public class ArrayAssignments {

	
	public static void main(String[] args) {

	/**
	Case 1: For primitive type arrays elements, we can provide any type which can be promoted to declared type
	
	eg: For int type - allowed elements are byte, short, char and int (other than this will throw compile time error)
		For float type array -  allowed elements are byte, short, char, int, long and float
	*/
		int[] a = new int[10];
		
			a[0] = 10;
			a[1] = 'b'; // char 'b' converted to int value - 98
			byte b = 20;
			a[2] = b;
			short s = 10;
			a[3] = s;
			//a[4] = 10l; // compile time error - Type mismatch: cannot convert from long to int
			//a[5] = 10.5 // compile time error - Type mismatch: cannot convert from double to int
		
		
		
	/**
	Case 2: For object type arrays elements, we can provide either declared type or its child class objects.
	*/
		// Can hold anything that inherits from Number; cannot hold a String
		Number[] num = new Number[10];
		
			num[0] = new Integer(10);
			num[1] = new Double(100.55);
			//num[2] = new String ("Multitude"); // compile time error - Type mismatch: cannot convert from String to Number
		
			
		// Can hold different types inheriting from Object. 
		//That is almost everything because Object is the root of the class hierarchy.Every class has Object as a superclass.
		Object[] obj = new Object[5];
			
			obj[0] = new Integer(10);
			obj[1] = new Double(110.566);
			obj[2] = new String("Multitude");
			obj[3] = new Object();
		
	/**
	Case 3: For abstract type arrays elements, we can provide its child class objects.
	*/	
			
		// Number is an abstract class	
		Number[] numb = new Number[10];
		
			numb[0] = new Integer(10);
			numb[1] = new Double(100.55);
			//numb[2] = new String ("Multitude"); // compile time error - Type mismatch: cannot convert from String to Number

	/**
	Case 4: For interface type arrays elements, we can provide its implementation class objects.
	*/	
		Runnable [] run = new Runnable[10];
		
			run[0] = new Thread();
			//run[1] = new String("Weird"); // compile time error - Type mismatch: cannot convert from String to Runnable
			
			
	/**
	Case 5: Element level promotions are not available in arrays
	
	eg: a). char value can be promoted to int type.
		    but char [] can not be promoted to int []
		    
		b). Child type array can be assigned to parent type variable.
	*/		
			// a).
			int [] i = {1,2,3,4,5};
			char[] j = {'a','b'};			
			int[] k = i;
			//int [] l = j; // compile time error - Type mismatch: cannot convert from char[] to int[]
			
			// b).
			String [] st = {"Java", "Javascript", "Python"};
			Object [] ob = st;
			
	/**
	Case 6: Whenever an array is assigned to another array only reference variable will be re-assigned
			but not underlying elements (type must be matched but not size)
	*/
			
			int [] tmp1 = {1,2,3,4,5,6,7,8,9,0};
			int [] tmp2 = {1,2};
			
			tmp1 = tmp2;
			tmp2 = tmp1;
	}

}
