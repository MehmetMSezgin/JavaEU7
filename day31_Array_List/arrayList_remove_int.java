package day31_Array_List;

import java.util.ArrayList;

public class arrayList_remove_int {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums = new ArrayList <> () ;
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty()); // it is checking empty or not
		System.out.println(nums.size()==0);
		
		nums.add(10) ;
		nums.add(20) ;
		nums.add(30) ;
		nums.add(40) ;
		nums.add(50) ;
		nums.add(60) ;
		nums.add(70) ;
		nums.add(80) ;
		nums.add(90) ;

		
		//removing index
		nums.remove(4) ; //removes index
		System.out.println(nums.toString());
		
		//removing object
		Integer n1 = new Integer (30) ; //converting primitive to object
		Integer n2 = Integer.valueOf(30) ;
		nums.remove(n1) ;
		
		//removing object 2 (specified element)
		nums.remove(new Integer(20)) ; // it removes first 20 in the list. If in the list there were two "20"
										// it just removes first one
		System.out.println(nums.toString()); 

		//printing for-iterator
		
		for (int i=0 ; i<nums.size() ; i++) {
			System.out.println(nums.get(i));
		}
		System.out.println("///////////////////////////////////");
		//printing for each
		for (int number : nums) {
			System.out.println(number + " ");
		}
		
		//Adding specific index
		nums.add(6, 100) ;  //index number 6 , add a new element 100
		System.out.println(nums.toString());
		
		//indexOf
		System.out.println(nums.indexOf(100)) ; // 100 in my index 6th
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
