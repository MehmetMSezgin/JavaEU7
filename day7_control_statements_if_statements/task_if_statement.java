package day7_control_statements_if_statements;

public class task_if_statement {

	public static void main(String[] args) {
		
		int hours=41 ;
		double payRate=1000 , newPayRate=1200 ; //sonucu gormek icin en basta
		                                        //bir sayi atamak zorundayiz
		if (hours > 40) {
			newPayRate= payRate * 1.5 ;
		}
		System.out.println(newPayRate);

		
		///////////////////////////////////////////////////
		
		int variableA=10 , variableB=50 , c=100 ;
		if (variableB==50 && c>=100) {
			variableA=20 ;
		}
		System.out.println(variableA);
	
		
	
	
	
	
	
	
	
	
	
	
	}

}
