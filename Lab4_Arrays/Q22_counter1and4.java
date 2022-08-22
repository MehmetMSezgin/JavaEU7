package Lab4_Arrays;

public class Q22_counter1and4 {

	public static void main(String[] args) {
		
		int[] x = {1,4,1,1,1,4,41,41,41,4,14,1,41,4,14,14,1,4,141,4,1,1,1} ;
		
		int counter1= 0 , counter4=0 ;
		
		for (int i=0 ; i<x.length ; i++) {
			
			if (x[i]==1) {
				counter1++ ;
			}
			
			if (x[i]==4) {
				counter4++ ;
			}
			
		}
		
		if(counter1>counter4) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
