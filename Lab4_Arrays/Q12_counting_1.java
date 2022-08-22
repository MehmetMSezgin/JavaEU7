package Lab4_Arrays;

public class Q12_counting_1 {

	public static void main(String[] args) {
		int [] x = {1,2,3} ;
		int [] y = {0,2,3} ;
		
		System.out.println(counter1(x,y));

	}
	
	public static int counter1 (int[] array1 , int[] array2) {
		
		int counter1= 0 ;
		int counter2= 0 ;
		
		if (array1[0]== 1) {
			counter1++ ;
		}
		
		if (array2[0]== 1) {
			counter2++ ;
		}
		int output = counter1 + counter2 ;
		return output ;
	}

}
