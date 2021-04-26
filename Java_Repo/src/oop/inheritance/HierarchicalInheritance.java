package oop.inheritance;

class Engineer1 {
	String skill1 = "problem solving";
	public void print() {
		System.out.println("I am an Engineer");
	}
}

class BackendEngineer1 extends Engineer {
	String skill2 = "clean code, System design, dataBases";
	public void printBackend() {
		System.out.println("I am a Backend Engineer");
	}
}

class FrontendEngineer1 extends Engineer {
	String skill3 = "react, design, responsive web";
	public void printFrontend() {
		System.out.println("I am a Frontend Engineer");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		FrontendEngineer1 frontend = new FrontendEngineer1();
		frontend.print();
		System.out.println("my skills are " + frontend.skill1);
		frontend.printFrontend();
		System.out.println("my skills are " + frontend.skill3);
		
		BackendEngineer1 backend = new BackendEngineer1();
		backend.print();
		System.out.println("my skills are " + backend.skill1);
		backend.printBackend();
		System.out.println("my skills are " + backend.skill2);
	}

}
