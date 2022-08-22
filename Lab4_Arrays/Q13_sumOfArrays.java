package Lab4_Arrays;

import java.util.Arrays;

public class Q13_sumOfArrays {

	public static void main(String[] args) {
			
		int[] i = {1,132,142,52215,5,121,5};
		int[] j = {123,12,412,412,412,412,4} ;
		largest(i,j) ;
		
	}
	
	public static void largest (int[] x , int[] y) {
		int sum1 = 0 ;
		int sum2 = 0 ;

		for (int i=0 ; i<x.length ; i++) {
			sum1 = sum1 + x[i] ;
		}
		
		for (int i=0 ; i<x.length ; i++) {
			sum2 = sum2 + y[i] ;
		}
		
		if (sum1>sum2) {
			System.out.println(Arrays.toString(x));
		}else if (sum1<sum2) {
			System.out.println(Arrays.toString(y));
		}else if (sum1==sum2) {
			System.out.println("equal");
		}
		
	}

}
