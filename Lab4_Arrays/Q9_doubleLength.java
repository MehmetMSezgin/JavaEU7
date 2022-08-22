package Lab4_Arrays;

import java.util.Arrays;

public class Q9_doubleLength {

	public static void main(String[] args) {
		
		int [] x = {1,2,3,4,5,6} ;
		System.out.println(Arrays.toString(doubleLength(x)));
	}
	
	public static int[] doubleLength (int[] array) {
		
		int [] newArray = new int[(array.length)*2] ;
		newArray[newArray.length-1] = array[array.length-1] ;
		
		return newArray ;
	}

}
