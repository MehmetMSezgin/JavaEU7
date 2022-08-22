package assignment6;

public class Q2 {

	public static void main(String[] args) {
		for (int j = 8 ; j>2 ; j--) {
			for (int i = 1 ; i<j ; i++) {
			System.out.print(i + " ");
			}
			if (j==3) {	
				break ;
			}else {
				System.out.println();
			}
		}
		
		for (int j = 1 ; j< 9 ; j++ ) {
			for (int i = 1 ; i<j ; i++) {
			
			System.out.print(i + " ");

			}
		System.out.println();	
		}

	}

}
