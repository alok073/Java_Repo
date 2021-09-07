package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {
		//Declaration
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		//add from front
		deque.offerFirst(10); //10
		deque.offerFirst(20); //20,10
		
		//1st element from the front
		deque.peekFirst(); //20
		
		//add from back
		deque.offerLast(30); //20,10,30
		deque.offerLast(40); //20,10,30,40
		
		//1st element from the back
		deque.peekLast(); //40
		
		//pop from front
		deque.pollFirst();//removes 20
		
		//pop from back
		deque.pollLast(); //removes 40
		
		System.out.println(deque); //10,30
	}

}
