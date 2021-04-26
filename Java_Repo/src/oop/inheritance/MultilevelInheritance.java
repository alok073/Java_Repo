package oop.inheritance;

class Engineer {
	String skill1 = "problem solving";
	public void print() {
		System.out.println("I am an Engineer");
	}
}

class BackendEngineer extends Engineer {
	String skill2 = "clean code, System design, dataBases";
	public void printBackend() {
		System.out.println("I am a Backend Engineer");
	}
}

class FrontendEngineer extends BackendEngineer {
	String skill3 = "react, design, responsive web";
	public void printFrontend() {
		System.out.println("I am a Frontend Engineer");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		FrontendEngineer frontEnd = new FrontendEngineer();
		
		frontEnd.print();
		System.out.println("my skills are " + frontEnd.skill1);
		
		frontEnd.printBackend();
		System.out.println("my skills are " + frontEnd.skill2);
		
		frontEnd.printFrontend();
		System.out.println("my skills are " + frontEnd.skill3);
		
	}

}
