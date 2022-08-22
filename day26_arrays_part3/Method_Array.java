package day26_arrays_part3;

import java.util.Random;

public class Method_Array {

	public static void main(String[] args) {
		
		createArray(5) ;
	}
	
	public static int[] createArray (int arraySize) {
		
		Random rn = new Random() ;
		
		int[] newArray = new int[arraySize] ;
		
		for (int i=0 ; i<newArray.length ; i++) {
			newArray[i] = rn.nextInt(100) ;
			System.out.println(newArray[i]);
		}
		
		return newArray ;
		
		
	}

}
