package day9_switch_case_statements;

public class switch_rules {

	public static void main(String[] args) {
		final String lastName= "smith" ;
		String firstName= "mike" ;
		int id=0 ;
		
		switch (firstName) {
		
			case "mike" :
				id=10 ;
				break ;
				
			case lastName : //if you use variable , above you must define as "final"
				id=5 ;
				break ;
				
			default :
				System.out.println("not valid");
				break;
		}

	}

}
