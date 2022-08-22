package assignment6;

public class Q4 {

	public static void main(String[] args) {
		
		String one = "1" ;
		String zero= "0" ;
		
		for(int i=1 ; i<=7 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				if((j%2)==0) {
					System.out.print(zero);
				}else {
					System.out.print(one);
				}
			}
			System.out.println();
		}

	}

}
