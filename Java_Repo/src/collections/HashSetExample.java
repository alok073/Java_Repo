package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		/*
		 * keeps only unique elements
		 * elements are in random order
		 * each operation in in O(1)
		 */
		
		//Declaration
		Set<Integer> hashSet = new HashSet<Integer>();
		
		//add elements
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		
		//check if it contains an element
		hashSet.contains(20);
		
		//remove elements
		hashSet.remove(20);
		
		//check if empty
		hashSet.isEmpty();
		
	}
}
