package assignment_on_StringMethods;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Please enter Split or No Split (true/false)");
		boolean isSplit = sc.nextBoolean() ;
		
		System.out.println("Number of people");
		int numberPeople = sc.nextInt() ;
		
		System.out.println("Check amount");
		double checkAmount = sc.nextDouble() ;	
		
		System.out.println("Service Quality");
		String serviceQuality = sc.next() ;
		
		tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality) ;

	}

	public static void tipCalculator(boolean isSplit , int numberPeople , double checkAmount , String serviceQuality) {
		
		double tip = 0 ;
		double totalAmount = 0 ;
		switch (serviceQuality) {
			case "Poor" :
				tip = checkAmount * 0.05 ;
				totalAmount = checkAmount + tip ;
				break ;
			case "Fair" :
				tip = checkAmount * 0.1 ;
				totalAmount = checkAmount + tip ;
				break ;
				
			case "Good" :
				tip = checkAmount * 0.15 ;
				totalAmount = checkAmount + tip ;
				break ;
			
			case "Great " :
				tip = checkAmount * 0.2 ;
				totalAmount = checkAmount + tip ;
				break ;
			
			case "Excellent" :
				tip = checkAmount * 0.25 ;
				totalAmount = checkAmount + tip ;
				break ;
			
			default :
				System.out.println("error");
				break ;
		}
		
		String str = "" ;
		for (int i=0 ; i<numberPeople ; i++) {
			str =str + "&" ;
		}
		
		
		if (isSplit==true) {
			System.out.println(str);
			System.out.println("Total to pay: " + totalAmount);
			System.out.println("Total tip: " + tip);
			System.out.println("Total per person: " + (totalAmount/numberPeople));
			System.out.println("Tip per person: " + (tip/numberPeople) );
		}else if (isSplit==false) {
			System.out.println(str);
			System.out.println("Total to pay: " + totalAmount);
			System.out.println("Total tip: " + tip);
		}
	}

}
