package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		/*
		 * keeps only unique elements
		 * stores elements in sorted order -> internal BST implemented
		 * each operation in in O(log n)
		 */
		
		//Declaration
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		//add elements
		treeSet.add(10);
		treeSet.add(60);
		treeSet.add(30);
		treeSet.add(90);
		System.out.println(treeSet); //10,30,60,90
		
		//check if it contains an element
		treeSet.contains(20);
		
		//remove elements
		treeSet.remove(20);
		
		//check if empty
		treeSet.isEmpty();

	}

}
