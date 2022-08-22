package Lab4_Arrays;

public class Q19_between6and7 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2} ;
		System.out.println(between6and7(x));
		
		int[] y = {1,2,2,6,99,99,7} ;
		System.out.println(between6and7(y));
		
		int[] a = {1,2,2,6,99,99,7,3,4} ;
		System.out.println(between6and7(a));	
		
		int[] b = {1,2,2,6,2} ;
		System.out.println(between6and7(b));
	}
	
	public static int between6and7 (int[] array) {
		
		int sum = 0 ;
		boolean boolCheckSix = false ; //learn how to use the flag
		
		for (int i=0 ; i<array.length ; i++) {
			
			if (boolCheckSix) {
				if (array[i]==7) {
					boolCheckSix = false ;
				}
			}else if (array[i]==6) {
				
				boolCheckSix= true ;
				
			}else {
				sum = sum + array[i] ;
			}
			
		}
		return sum ;
		
	}

}
