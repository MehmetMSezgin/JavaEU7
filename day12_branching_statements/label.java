package day12_branching_statements;

public class label {

	public static void main(String[] args) {
		
		int i=0 ;
						//label tanimladiginda ":" iki nokta ust uste kullan
			outer : do {
				i=8 ;
				inner :
				 while (true) {
					 System.out.println(i--);
					 if (i==4) {
						 break outer ;
					 }
				 }
			} while (true) ;

	}

}
