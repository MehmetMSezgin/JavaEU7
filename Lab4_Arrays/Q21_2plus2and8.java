package Lab4_Arrays;

public class Q21_2plus2and8 {

	public static void main(String[] args) {
		
		int [] x = {2,3,2,2,4,2} ;
		
		int counter = 0 ;
		for (int i=0 ; i<x.length ; i++) {
			if (x[i]==2) {
				counter= counter + x[i] ;
			}
			
		}
		
		if (counter==8) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
