package oop.inheritance;

class Hello {
	public void printHello() {
		System.out.println("Hello ");
	}
	
	public void temp() {
		System.out.println("temp1");
	}
}

class World extends Hello {
	public void printWorld() {
		System.out.print("World!");
	}
	
	public void temp() {
		System.out.println("temp2");
	}
}

class Universe extends World {
	public void printUniverse() {
		System.out.println(" & Universe!");
	}
	
	public void temp() {
		//System.out.println("temp3");
		super.temp();
	}
}

public class singleInheritance {

	public static void main(String[] args) {
//		World worldObj = new World();
//		
//		worldObj.printHello();
//		worldObj.printWorld();
		
		Universe universeObj = new Universe();
		universeObj.printHello();
		universeObj.printWorld();
		universeObj.printUniverse();
		
		universeObj.temp();
	}

}
