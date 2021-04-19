package oop.constructors;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Q) What is a constructor?
		 * - Constructors are methods with it's name same as the class name.
		 * - They are used to initialize instance variables
		 * - They are called whenever an object is created
		 */
		
		//calls default Constructor
		Student student1 = new Student();
		System.out.println(student1.studentName + " " + student1.rollNo);
		
		//calls parameterized Constructor
		Student student2 = new Student("Shubham", 2);
		System.out.println(student2.studentName + " " + student2.rollNo);
	}

}
