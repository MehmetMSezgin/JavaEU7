package day32_arrayList_part2;

import java.util.ArrayList;

public class removeAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>() ;
		
		list1.add(30) ; list1.add(22) ; list1.add(12) ;
		
		ArrayList <Integer> list2 = new ArrayList<>() ;
		
		list2.add(10) ; list2.add(20) ; list2.add(30) ; list2.add(40) ;
		
		System.out.println(list1);
		System.out.println(list2);
		
		list2.removeAll(list1) ; //removes all matching 

		System.out.println(list1);
		System.out.println(list2);

		

	}

}
