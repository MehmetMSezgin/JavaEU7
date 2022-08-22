package assignment6;

public class Q5 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=7 ; i++) {
			for (int j=1 ; j<=7 ; j++) {
				int number =7- i +1 ;
				if (j<number) {
					System.out.print(1);
				}else {
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
