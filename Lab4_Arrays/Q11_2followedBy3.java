package Lab4_Arrays;

import java.util.Arrays;

public class Q11_2followedBy3 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3} ;
		System.out.println(Arrays.toString(followedBy2(x)));
		
		int[] y = {3,2,5} ;
		System.out.println(Arrays.toString(followedBy2(y)));
	}
	
	public static int[] followedBy2 (int[] array) {
		
		for (int i = 0 ; i<(array.length-1) ; i++) {
			if (array[i] ==2 && array[i+1]==3) {
				array[i+1] = 0 ;
			}
		}
		return array ;
	}

}
