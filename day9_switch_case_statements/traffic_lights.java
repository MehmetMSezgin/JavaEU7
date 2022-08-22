package day9_switch_case_statements;

public class traffic_lights {

	public static void main(String[] args) {
		char light='r' ;
		
		switch ( light ) {
			case 'R' : case 'r' : //caseler arka arkaya kullanilabilir
				System.out.println("Red light");
				break ;
				
			case 'Y' : case 'y' : 
				System.out.println("Yellow");
				break ;
				
			case 'G' : case 'g' : 
				System.out.println("Green");
				break ;
				
			default :
				System.out.println("select valid day");
				break ;
		
		
		
		
		
		
		
		
		
		
		}
		

	}

}
