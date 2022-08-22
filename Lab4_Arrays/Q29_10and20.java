package Lab4_Arrays;

import java.util.Arrays;

public class Q29_10and20 {

	public static void main(String[] args) {
		
		int[] x = {2,10,3,4,20,5} ;
		System.out.println(Arrays.toString(tenRun(x)));

	}
	
	public static int[] tenRun (int[] array) {
		
		
		for(int i=0 ; i<array.length ; i++) {
			
			if ((array[i]%10)==0) {
				
				for (int j=i+1 ; ((j<array.length) && (array[j]%10 !=0)) ; j++) {
					array[j] = array [i] ;
				}
					
			 }
			}
			return array ;
		}
		
	}


