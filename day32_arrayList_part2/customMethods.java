package day32_arrayList_part2;

import java.util.ArrayList;

public class customMethods {
	public static void main(String[] args) {
		
		ArrayList <Integer> numsList = new ArrayList <>() ;
		numsList.add(12);
		numsList.add(11);
		numsList.add(1123);
		numsList.add(124);
		numsList.add(112);
		numsList.add(112);
		numsList.add(1442);
		numsList.add(127);
		
		printList(numsList) ;
	}

	public static void printList(ArrayList<Integer> numsList) {
		
		for (int i=0; i<numsList.size() ; i++) {
			System.out.println(numsList.get(i));
		}
		
	}


//////////////////////////////////////////////////////////////
	
	public static ArrayList<Integer> getList (int size) {
		ArrayList<Integer> newList = new ArrayList<> () ;
		
		for (int i=0 ; i<=size ; i++) {
			newList.add(i) ;
		}
		return newList ;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
