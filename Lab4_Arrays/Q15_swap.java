package Lab4_Arrays;

import java.util.Arrays;

public class Q15_swap {

	public static void main(String[] args) {
		
		int [] x = {1,2,3,4} ;
		System.out.println(Arrays.toString(swapEnds(x)) );
	}
	
	public static int[] swapEnds (int[] arr) {
		int tempt = 0 ;
		tempt = arr[0] ;
		arr[0] = arr[arr.length-1] ;
		arr[arr.length-1] = tempt ;
		
		return arr ;
	}

}
