package day47_collections_part2;

import java.util.*;

public class Queue_example {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("muki");
		queue.add("name");
		queue.add("name2");
		queue.add("name3");
		queue.add("name4");
		queue.add("name5");

		
		//in queue ,first in first out
		
		String element = queue.remove();
		System.out.println(element);
		
		
		System.out.println(queue.toString());
		//this is removing too but it returns null if the queue is empty
		queue.poll();
		
		//get the element at the front of the queue without removing it using peek()
		queue.peek();
		

	}

}
