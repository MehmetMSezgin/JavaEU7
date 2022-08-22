package Lab4_Arrays;

import java.util.Arrays;

public class Q6_greatest {

	public static void main(String[] args) {
		int[] x = {1,2,3} ;
		System.out.println(Arrays.toString( greatest(x)));
		
		int[] y = {5,123,412,214,214124,152} ;
		System.out.println(Arrays.toString( greatest(y)));


	}
	
	public static int[] greatest (int[] arr) {
		
		Arrays.sort(arr); // kucukten buyuge siralar
		
		for (int i=0 ; i<arr.length ; i++) {
			arr[i]= arr[(arr.length-1)] ;
		}
		return arr ;
	}

}
