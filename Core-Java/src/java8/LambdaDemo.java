package java8;

interface Interf {
	public void add(int a, int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		Interf i = (a, b) -> System.out.println("The sum: " + (a + b));
		i.add(10, 20);
	}

}
