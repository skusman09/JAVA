package stackDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("unused")
		Stack<Integer> stack=new Stack<>(); 
		stack.push(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());

	}

}
