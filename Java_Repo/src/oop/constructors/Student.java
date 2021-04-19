package oop.constructors;

public class Student {
	
	public String studentName;
	public int rollNo;
	
	/**
	 * Q) How to declare a Constructor?
	 * - AccessModifier className(parameters) { }
	 */
	
	//default Constructor
	public Student() {
		this.rollNo = 1;
		this.studentName = "alok";
	}
	
	//Parameterized Constructor
	public Student(String studentName, int rollNo) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	}
	
	/**
	 * Q) Do constructors have a return type?
	 * - NO
	 */
	
	/**
	 * NOTE = Constructors cannot be static, final, abstract or synchronized
	 */

}
