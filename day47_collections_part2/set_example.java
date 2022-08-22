package day47_collections_part2;

import java.util.*;

public class set_example {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(100);
		mySet.add(200);
		mySet.add(300);
		mySet.add(400);
		mySet.add(100); //it does not allow dublicates , so it wont keep this 100
		mySet.add(100);
		
		System.out.println(mySet.toString()); //set does not track the order
		System.out.println(mySet.size());
		
		////////////////////////////////////////////
		List<String> list = Arrays.asList("23","23", "a" , "a", "b" , "c");
		
		Set<String> unique = new HashSet<>(list);
		
		System.out.println(list.toString());
		System.out.println(unique.toString());




	}

}
