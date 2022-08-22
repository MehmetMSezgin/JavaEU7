package day10_controlFlowStatements;

public class task42_totalNumber_loop {

	public static void main(String[] args) {
		
		int sumEven=0 ;
		int sumOdd=0 ;
		
		for (int i=1; i<100 ; i++) {
			if (i%2==0) {
				sumEven= sumEven + i ;
				
			}else {
				sumOdd= sumOdd + i ;
				}
					
		
		}
		System.out.println("Total even " + sumEven);
		System.out.println("Total odd " + sumOdd);
		System.out.println("Total of total :) " + (sumEven + sumOdd));
											//ikinci parentezi kullan yoksa toplamaz
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
