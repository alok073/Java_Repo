package collections.arrays;

class Student {
	
	public int rollNumber;
	public String name;
	
	public Student(int rollNumber, String name) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public static void printDetails(Student s) {
		System.out.println(s.name + " " + s.rollNumber);
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {

		Student studentArray[] = new Student[5];
		studentArray[0] = new Student(1, "abc");
		studentArray[1] = new Student(2, "xyz");
		
		Student.printDetails(studentArray[0]);
	}

}
