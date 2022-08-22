package Lab4_Arrays;

import java.util.Arrays;

public class Q5_rotatedLeft {

	public static void main(String[] args) {
		
		int[] x ={1,2,3,4,5,6,7,8} ;
		System.out.println(x.length);
		System.out.println(Arrays.toString(rotatedLeft(x)));

		
	}
	
	public static int[] rotatedLeft (int[] array) {
		
		int a = array[0] ;
		for(int i=0 ; i<array.length-1 ; i++) {
			
			array[i] = array[i+1] ;
		}
		
		array[array.length-1] = a ;
		return array;
	}

}
