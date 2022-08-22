package Lab4_Arrays;

public class Q10_twice {

	public static void main(String[] args) {
		
		int[] x = {2,3} ;
		System.out.println(twice(x));
		
		int[] y = {2,2} ;
		System.out.println(twice(y));
	}
	
	public static boolean twice(int[] array) {
		int counter2 = 0 ;
		int counter3 = 0 ;

		
		for (int value : array) {
			if (value == 2) {
				counter2++ ;
			}else if (value == 3) {
				counter3++ ;
			}
		}
		
		if (counter2==2 || counter2==2) {
			return true ;
		}
		
		return false ;
		
		
	}

}
