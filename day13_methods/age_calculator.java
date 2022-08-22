package day13_methods;

public class age_calculator {

	public static void main(String[] args) {
		int bdate=1991 ;
		int currentyear=2021 ;
		ageCalculator(currentyear , bdate);
		//or
		ageCalculator(2021, 1973);
		ageCalculator(2021, 1962);
	}

	public static void ageCalculator(int currentyear , int bdate) {
		System.out.println("age " + (currentyear- bdate));
		
	}

}
