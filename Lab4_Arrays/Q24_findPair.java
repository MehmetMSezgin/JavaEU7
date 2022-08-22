package Lab4_Arrays;

public class Q24_findPair {

	public static void main(String[] args) {
		int[] x = {1,2,3,4,1};
		int y = 1 ;
		System.out.println(findPair(x,y));
		

	}
	
	public static boolean findPair (int[] array , int a) {
		
		int counter = 0 ;
		for (int i=0 ; i<array.length ; i++) {
			
			if (array[i] == a) {
				counter++ ;
			}
			
		}
		
		if(counter==2) {
			return true ;
		}
		return false ;
		
		
	}

}
