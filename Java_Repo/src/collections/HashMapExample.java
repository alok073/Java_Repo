package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		/*
		 * each operation in in O(1)
		 * elements are not in sorted order
		 */
		
		//Declaration
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		//insert values
		hashMap.put("abc", 1);
		hashMap.put("xyz", 2);
		
		//update values
		hashMap.put("abc", 3);
		
		//get values
		System.out.println(hashMap.get("abc")); //3
		
		//get default value if key is not present
		System.out.println(hashMap.getOrDefault("pqr", 100)); //100 -> since there is no key "pqr" so it returns default value as 100
		
		//check if a key is present
		hashMap.containsKey("abc");
		
		//check if a value is present
		hashMap.containsValue(2);
		
		//Traverse
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
		}
		
		//traverse only through keys
		for(String keys : hashMap.keySet()) {
			String key = keys;
		}
		
		//traverse only through values
		for(Integer values : hashMap.values()) {
			int val = values;
		}
		
		//check if is Empty
		hashMap.isEmpty();
		
		//size
		hashMap.size();
		
		//clear a hashMap
		hashMap.clear();
		
	}

}
