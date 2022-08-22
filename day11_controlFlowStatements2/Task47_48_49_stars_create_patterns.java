package day11_controlFlowStatements2;

public class Task47_48_49_stars_create_patterns {

	public static void main(String[] args) {
		int rows=6 ;
		int columns=6 ;
		
		for (int i=1 ; i<=rows ; i++) {
			
			for (int j=1 ; j<=columns ; j++) {
				System.out.print("*");        //Print ln degil dikkat et
			}
			System.out.println("");
		}
		
		
		//////////////////////////////////////////
		
	for (int i=1 ; i<=6 ; i++) {
			
			for (int j=1 ; j<=i ; j++) {
				System.out.print("+");        
			}
			System.out.println("");
		}
	
	///////////////////////////////////////
	
	
	for (int i=1 ; i<=6 ; i++) {
		
		for (int j=1 ; j<=i ; j++) {
			System.out.print(" ");        
		}
		System.out.println("!");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
