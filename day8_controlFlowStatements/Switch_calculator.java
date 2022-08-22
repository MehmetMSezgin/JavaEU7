package day8_controlFlowStatements;

public class Switch_calculator {

	public static void main(String[] args) {
		int no1=10 ;
		int no2= 5 ;
		String operator= "/" ;
		double result=0 ;
		
		switch (operator) {
			
			case "+" :
				result= no1 + no2 ;
				break ;
			
			case "-" :
				result= no1 - no2 ;
				break ;
				
			case "*" :
				result= no1 * no2 ;
				break ;
				
			case "/" :
				result= no1 / no2 ;
				break ;
				
			default :
				System.out.println("not valid operator");
				break ;
		}
		System.out.println(result);
          
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
