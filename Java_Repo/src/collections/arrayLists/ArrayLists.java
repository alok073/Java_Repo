package collections.arrayLists;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		//Declaration
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		ArrayList<String> arrList2 = new ArrayList<String>();
		
		//add elements
		arrList1.add(1);
		arrList1.add(2);
		arrList1.add(0, 99);
		arrList2.add("hello");
		arrList2.add("world");
		
		//change elements
		arrList1.set(0, 100); //{index, value}
		
		//get elements
		System.out.println(arrList2.get(0)); //hello
		
		//remove elements
		arrList1.remove(0); //{index}
		arrList2.remove("hello"); //remove 1st occurrence of "hello"
		
		//size
		System.out.println(arrList1.size());
	}

}
