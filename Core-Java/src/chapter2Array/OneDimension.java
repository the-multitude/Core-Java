package chapter2Array;

public class OneDimension {

	public static void main(String args[]) {
		
		// Array Declaration - Declaring a variable(month_days) of type integer array.
		int[] month_days;
		
		// Array Instantiation - Every array in Java is object ("new" is a Java keyword. It creates a Java object)
		// Size should be specified at the time of Instantiation (otherwise it will throw compile time error)
		// If negative size are specified in array it will throw run time exception - NegativeArraySizeException
		month_days = new int[12];
		
		//Array initialization - When ever array is created it's automatically initialized with default value "null"
		month_days[0] = 31; // Default value for int "0" has been modified with the value "31"
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		System.out.println("May has " + month_days[4] + " days.");
		
		
		// Array Declaration , Instantiation and initialization in a single line
		
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println(days[0]+" comes after saturday? weird." );
				
		}

}
