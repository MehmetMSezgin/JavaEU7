package Lab4_Arrays;

import java.util.Arrays;

public class Q7_twoArrays {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4} ;
		int[] y = {} ;
		
		System.out.println(Arrays.toString(firstLast(x,y)));
		

	}
	
	public static int[] firstLast (int[] array1 , int[] array2) {
		
		
		int [] array3 = {array1[0] , array1[array1.length-1] } ;
		
		// or you could extend second array ---> array2 = new int[2] ;
		
		return array3;
	}
}
