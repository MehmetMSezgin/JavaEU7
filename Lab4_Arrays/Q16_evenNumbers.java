package Lab4_Arrays;

public class Q16_evenNumbers {

	public static void main(String[] args) {
		
		int [] x ={2,1,41,142,251,51,15,623} ;
		System.out.println(even(x));
	}
	
	public static int even (int[] array) {
		
		int counter = 0 ;
		for (int i=0 ; i<array.length ; i++) {
			if (array[i]%2==0) {
				counter++ ;
			}
		}
		return counter ;
	}

}
