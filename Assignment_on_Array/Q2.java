package Assignment_on_Array;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		
		int[] array = new int[10] ;
		
		for (int i=0 ; i<10 ; i++) {
			array[i]= i+1 ;
		}
		//System.out.println(Arrays.toString(array));
		
		for (int j=0 ; j<array.length ; j++) {
			System.out.println(19*array[j]);
		}

	}

}
