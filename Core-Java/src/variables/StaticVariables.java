package variables;

/**
Static Variable:

 * If the value of a variable not varied from object to object then it's never recommended to declare that variable
	at object level, such type of variables should be declared at Class level using "Static" modifier

 * In case of Static variable single copy will be created at class level and that copy will be shared by all objects.
   So performing any changes to Static variables, it will be reflected to all objects.

 * The scope of Static variables is same as the scope of the Class, because static variable
	  will be created at the time of class creation and destroyed at the time of class unloading.
	  So it can be accessed from static area and instance area.

	  ->	Java StaticVariables (execution process)
	  		1. Start JVM
	  		2. Create main thread
	  		3. Locate StaticVariables.java
	  		4. Load StaticVariables.class (Static variable creation)
	  		5. Execute main() method of StaticVariables.class
	  		6. unload StaticVariables.class (Static variable destruction)
	  		7. Destroy main thread
	  		8. Shutdown JVM

 * Static variable should be declared within the class but outside of any method or block or constructor with
      static modifier

 * Static variable can be accessed by using class name or object reference, but recommend to use class name.
     Within in a same class even it's not required to use class name, it can be directly accessed.

 * For Static variable it is not required to initializes explicitly, JVM will provide default values

 */


public class StaticVariables {

	static int x = 10;
	static String s;
	static int k;
	static boolean b;

	public static void main(String[] args) {

		System.out.println(StaticVariables.x); // accessing through class name

		System.out.println(x); // accessing directly

		StaticVariables val = new StaticVariables();
		System.out.println(val.x); // accessing through object

		// For Static variable it is not required to initializes explicitly
		System.out.println(s); // Output : null
		System.out.println(k); // Output : 0
		System.out.println(b); // Output : false

	}

	public void method() {

		System.out.println(x); // accessing static variable in instance area
	}




}
