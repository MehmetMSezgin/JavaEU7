package day7_control_statements_if_statements;

public class if_statements {

	public static void main(String[] args) {
		int score=80 ;
		if (score>=50) {
			System.out.println("congrats!!!!");
		} //if it is false I mean score smaller than 50
		  // then automatically java passed the line after curly braces
		
		
		//second way to do it
		int score2=51 ;
		boolean x= score2>=50 ;
		if (x) {
			System.out.println("passed!!");
		}

		
		/////////////////////////////////////////////////////////////////
		int sales,bonus;
		double commissionRate, salary ;
		sales = 5000 ;
		salary = 10000;
		
		if (sales>5000) { 
			bonus=500 ;
			commissionRate=1.2;
			salary = salary *  commissionRate + bonus ;
			
		}  //if sales does not pass 5000 , java does not implement "if" condition
		System.out.println("salary " + salary) ;
		
		/////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
