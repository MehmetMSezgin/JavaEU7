package Lab4_Arrays;

import java.util.Arrays;

public class Q23_createNewArray {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(createArray(10)));
		System.out.println(Arrays.toString(createArray(15)));
		System.out.println(Arrays.toString(createArray(4)));

	}
	
	public static int[] createArray (int x) {
		
		int arr[] = new int[x] ;
		
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] = i ;
		}
		
		return arr ;
		
	}

}
