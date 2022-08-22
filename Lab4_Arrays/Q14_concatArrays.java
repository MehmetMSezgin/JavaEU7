package Lab4_Arrays;

import java.util.Arrays;

public class Q14_concatArrays {

	public static void main(String[] args) {
		int [] a = {1,2} ;
		int [] b = {3,4} ;
		System.out.println(Arrays.toString(concat(a,b)));

	}
	
	public static int[] concat (int[] x , int[] y) {
		
		int[] z = new int[(x.length)+(y.length)] ;
		
		for (int i=0 ; i<x.length ; i++) {
			z[i] = x[i] ;
		}
		
		int dummy= 0 ;
		for (int j= x.length ; j< z.length ; j++) {
				z[j] = y[dummy] ;
				dummy++;
		}
		return  z ;
	}

}
