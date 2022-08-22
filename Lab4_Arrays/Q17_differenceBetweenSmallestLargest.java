package Lab4_Arrays;

public class Q17_differenceBetweenSmallestLargest {

	public static void main(String[] args) {
		
		int[] x = {10,9,8,7,6,11};
		System.out.println(difference(x));
	}
	
	public static int difference (int[] array) {
		
		int max = 0 ;
		int min = 0 ;
		for (int i=0 ; i<(array.length) ; i++ ) {
			if (array[i]>max) {
				max = array[i] ;
			}
		}
		
		for (int i=0 ; i<(array.length-1) ; i++ ) {
			if (array[i]<array[i+1]) {
				min = array[i] ;
			}
		}
		
		return max-min ;
	}
}
