package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//declaration
		Stack<Integer> stack = new Stack<>();
		
		//insert elements in a stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//check the top element of the stack
		int top = stack.peek();
		
		//pop the top element
		stack.pop();
		
		//size
		stack.size();
		
		//empty?
		stack.isEmpty();
	}

}
