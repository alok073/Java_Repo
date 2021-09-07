package collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		//Declaration - minHeap
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		//Declaration - maxHeap
		PriorityQueue<Integer> maxHeap = new  PriorityQueue<Integer>(Collections.reverseOrder());
		
		//add element
		minHeap.offer(10);
		minHeap.add(24);
		minHeap.offer(15);
		
		//top element
		minHeap.peek();
		
		//remove an element
		minHeap.poll();
	}

}
