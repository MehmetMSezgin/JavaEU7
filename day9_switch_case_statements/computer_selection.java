package day9_switch_case_statements;

public class computer_selection {

	public static void main(String[] args) {
		
		String models= "apple" ;
		
		switch (models) {
		
			case "apple" :
				System.out.println("Apple no virus");
				break ;
				
			case "dell" :
				System.out.println("tough one");
				break ;
				
			case "acer" :
				System.out.println("not recommended");
				break ;
				
			default :
				System.out.println("dont buy that one");
				break;
		}
		


		
	}

}
