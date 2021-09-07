package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		/*
		 * each operation in in O(log n)
		 * elements are in sorted order based on keys
		 */
		
		//Declaration
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//insert values
		treeMap.put(4, "abc");
		treeMap.put(6, "xyz");
		treeMap.put(1, "abc");
		
		System.out.println(treeMap); //{1=abc, 4=abc, 6=xyz}
		
	}

}
