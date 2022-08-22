package Assignment_on_Array;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		
		int n = 10 ;
		int[] array = new int[n] ;
		array[0] = 0 ;
		array[1] = 1 ;
		int pre1=0 ;
		int pre2=1 ;
		
		for (int i=2 ; i<n ; i++) {
			

			int sum= pre1 + pre2;
			array[i] = sum ;
			pre1= pre2;
			pre2= sum;
			
			
		}
		System.out.println(Arrays.toString(array));

	}

}
