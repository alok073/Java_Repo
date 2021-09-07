package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		/*
		 * keeps only unique elements
		 * stores elements in the same order as inserted
		 */
		
		//Declaration
		Set<Integer> linkedSet = new LinkedHashSet<Integer>();
		
		//add elements
		linkedSet.add(10);
		linkedSet.add(60);
		linkedSet.add(30);
		linkedSet.add(90);
		System.out.println(linkedSet); //10,60,30,90
		
		//check if it contains an element
		linkedSet.contains(20);
		
		//remove elements
		linkedSet.remove(20);
		
		//check if empty
		linkedSet.isEmpty();

	}

}
