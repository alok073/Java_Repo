package methods.Overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		/**
		 * Method Overloading is same method name in same class with different signatures(no./types of parameters)
		 */
		
		int a=1, b=2;
		double d = 2.5;
		System.out.println(sum(a,b)); //3
		System.out.println(sum(a,d)); //3.5
		
		/**
		 * Q) Can we overload methods based on it's return type 
		 * -> Yes...But only if dataTypes of the parameters are explicitly specified
		 * -> But if the method ONLY differ by their return type we cannot overload them
		 * -> eg.
		 */
		System.out.println(display(a)); //hello
		System.out.println(display()); //c
		
		/**
		 * Q) Can we overload main method
		 * -> Yes
		 */
		String s = "overloading main function";
		main("s");
		
		/**
		 * Q) Can we overload methods that differ only by "static" keyword -> NO
		 */
		
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static double sum(int a, double b) {
		return a+b;
	}
	
	public static String display(int a) {
		return "hello";
	}
	
	public static char display() {
		return 'c';
	}
	
	public static void main(String s) {
		System.out.println(s);
	}

}
