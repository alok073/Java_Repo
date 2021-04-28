package basics.keywords;

/**
 * - super keyword is a reference of parent class object
 * - Used for
 * 1. calling methods/variables of parent class
 * 2. invoking parent class constructor from child class constructor
 * 3. method overriding
 * @author alok
 */

class Vehicle {
	int maxSpeed = 200;
	String colour = "black";
	
	public Vehicle() {
		System.out.println("This is vehicle class");
	}
	
	public void message() {
		System.out.println("hello!");
	}
}

class Car extends Vehicle {
	int maxSpeed = 120;
	String colour = "red";
	int price = 500000;
	
	public Car() {
		//calling constructor of parent
		//NOTE = constructor call of parent should be the 1st statement in child constructor
		super(); 
		System.out.println("This is Car class");
	}
	
	public static void msg() {
		System.out.println("static");
	}
	
	public void message() {
		System.out.println(this.maxSpeed + " " + super.maxSpeed);
		//calling parent class method.
		//this is a case of method overriding...parent & child class have same method name & signature
		//using super keyword we differentiate between parent & child method
		super.message();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Car carObj = new Car();
		carObj.message();
		
		Car.msg();
	}
}

/**
 * O/P 
 * This is vehicle class
   This is Car class
   120 200
   hello!
 */
