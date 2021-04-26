package oop.inheritance;

class Hello {
	public void printHello() {
		System.out.println("Hello ");
	}
}

class World extends Hello {
	public void printWorld() {
		System.out.println("World!");
	}
}

public class singleInheritance {

	public static void main(String[] args) {
		World worldObj = new World();
		
		worldObj.printHello();
		worldObj.printWorld();
	}

}
