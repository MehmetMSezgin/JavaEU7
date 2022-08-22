package day7_control_statements_if_statements;

public class if_else_statements {

	public static void main(String[] args) {
		int score=79 ;
		if (score>=50) {
			System.out.println("Congrats");
		} 
			else {
				System.out.println("Fail, try again") ;
				}
	//////////////////////////////////////////////////////////////
		
		int sales,bonus;
		double commissionRate, salary ;
		sales = 5001 ;
		salary = 10000;
		
		if (sales>5000) { 
			bonus=500 ;
			commissionRate=1.2;
			
		} else { 
			bonus=30 ;
			commissionRate=0.7 ;
			
		}
		salary = salary *  commissionRate + bonus ;

		System.out.println("salary " + salary) ;

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
