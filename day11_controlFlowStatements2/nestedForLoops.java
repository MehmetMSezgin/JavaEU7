package day11_controlFlowStatements2;

public class nestedForLoops {

	public static void main(String[] args) {
		for (int i=1 ; i<=5 ; i++ ) {
			
			System.out.println("out= " + i);
			
			for (int j=1 ; j<=2 ; j++) {
				System.out.println("i " + i + "j " + j);
			}
		}
       
			
			///////////////////////////////////////////
			
			
	for (int i=1 ; i<=5 ; i++ ) {
			
			System.out.println("out= " + i);
			
			for (int j=1 ; j<=2 ; j++) {
				System.out.println("i " + i + " j " + j);
			
				if (j==2) {
					System.out.println("if");
				}
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
