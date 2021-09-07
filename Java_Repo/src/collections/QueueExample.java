package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//declaration
		Queue<Integer> queue = new LinkedList<>();
		
		//add an element
		queue.offer(5);
		queue.offer(10);
		queue.offer(15);
		
		//pop an element
		queue.poll();
		
		//1st element of the queue
		int a = queue.peek();
	}

}
