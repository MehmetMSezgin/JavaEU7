package day24_arrays_part1;

public class Array_initialization_shortcut {

	public static void main(String[] args) {
		
		int[] myList = {1,2,3,4} ;
		
		////////SAME
		
		int[] myList2 = new int[4] ;
		myList[0] = 1 ;
		myList[1] = 2 ;
		myList[2] = 3 ;
		myList[3] = 4 ;
		
		///////////////////////
		
		System.out.println(myList.length); //Size of the array
		System.out.println("************");
		///////////////
		
		for (int i=0 ; i<myList.length ; i++) {
			System.out.println(myList[i]);
		}

	}

}
