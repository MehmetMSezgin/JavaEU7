package day31_Array_List;

import java.util.ArrayList;

public class array_list_intro {

	public static void main(String[] args) {
		
		//Creating array list
		ArrayList <String> names = new ArrayList<>() ;
		
		ArrayList <Integer> nums = new ArrayList<>() ;
		
		//assigning values to array list
		names.add("mike") ;
		nums.add(99) ;
		
		//Reading
		
		System.out.println(names.get(0));
		System.out.println(nums.get(0));
		System.out.println(nums.size());


		
		
		

	}

}
