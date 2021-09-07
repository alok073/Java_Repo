package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		//Declaration
		List<Integer> arrList1 = new ArrayList<Integer>();
		List<String> arrList2 = new ArrayList<String>();
		
		//initialize an ArrayList
		List<Integer> arrList3 = new ArrayList<Integer>(
				Arrays.asList(3,4,2,5,1));
		
		//add elements
		arrList1.add(1);
		arrList1.add(2);
		arrList2.add("hello");
		arrList2.add("world");
		
		//add element at a particular index
		arrList1.add(0, 99);
		
		//add an entire list to another list
		arrList1.addAll(arrList3);
		
		//get elements
		System.out.println(arrList2.get(0)); //hello
		
		//change elements
		arrList1.set(0, 100); //{index, value}
		
		//remove element from an index
		arrList1.remove(0); 
		
		//remove an element
		//this removes the 1st occurence of the element passed
		arrList1.remove(Integer.valueOf(4));
		arrList2.remove("hello"); 
		
		//clear an entire list
		arrList2.clear();
		
		//size
		System.out.println(arrList1.size());
		
		//check if list is empty
		boolean empty = arrList1.isEmpty();
		
		//check if an element is present in arrayList
		boolean isPresent = arrList1.contains(5);
		
		//Traverse an arrayList
		for(int i=0; i<arrList1.size(); i++) {
			int x = arrList1.get(i);
		}
		
		//for each loop
		for(Integer i:arrList1) {
			int x = i;
		}
		
		//Iterator
		Iterator<Integer> itr = arrList1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sort
		Collections.sort(arrList1);
		
		//sort - descending
		Collections.sort(arrList1, Collections.reverseOrder());
		
		//min.max
		Collections.min(arrList1);
		Collections.max(arrList1);
		
		
		//find freq of an element in a list
		Collections.frequency(arrList1, 1);
	}

}
