package day47_collections_part2;

import java.util.Stack;

public class stack_example {

	public static void main(String[] args) {
		
		Stack<Integer> numStack = new Stack<>();
		
		numStack.add(50);
		numStack.add(70);
		numStack.add(70);
		numStack.add(100);
		
		System.out.println(numStack.toString());
		
		numStack.pop(); //removed last one
		
		System.out.println(numStack.toString());
		
		System.out.println(numStack.get(0));

		
		
		

		
		

	}

}
