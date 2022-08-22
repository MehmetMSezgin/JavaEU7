package Lab4_Arrays;

public class Q4 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3} ;
		int[] y = {5,10,15} ;
		System.out.println(average(y));

	}
	
	public static int average (int[] array) {
		
		int total = 0 ;
		for (int i=0 ; i<array.length ; i++) {
			total = total + array[i] ;
		}
		int result = total/ (array.length) ;
		return result ;
	}

}
