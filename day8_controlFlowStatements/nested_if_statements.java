package day8_controlFlowStatements;

public class nested_if_statements {

	public static void main(String[] args) {
		
		boolean isRushHour= true ;
		int carType= 1 ;
		double price= 0.0 ;
		
		if (carType==1) {
			if (isRushHour) {
				price= 30;
			}else {
				price= 5.0 ;
			}
		} else if (carType==2) {
			if (isRushHour ) {
				price= 50 ;
			}else {
				price= 15.99 ;
			}
		}else {
			System.out.println("select a valid type");
		} 
		System.out.println(price);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
