package assignment_on_StringMethods;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		carInsurancePremium();
		
	}
	
	public static void carInsurancePremium () {
		double policyPrice = 0 ;
		String referenceNumber = "" ;
		System.out.println("Welcome to the CountyFarm car insurance!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Do you have a US driver licence?");
		boolean answer1 = sc.nextBoolean();
		
		if (answer1==false) {
			System.out.println("Invalid data");
			System.exit(0);
		}
		/////////////////////////////////////////
		System.out.println("Enter zip code");
		int zipCode = sc.nextInt();
		
		if (zipCode==20910 || zipCode==20740) {
			policyPrice = policyPrice + 60 ;
		}else if (zipCode==22102 || zipCode== 22103) {
			policyPrice+= 30 ;
		}else {
			policyPrice+= 20 ;
		}
		/////////////////////////////////////////
		System.out.println("Is this vehicle owned , financed or leased?");
		String answer2 = sc.next();
		if (answer2.equalsIgnoreCase("owned")) {
			policyPrice+=10 ;
		}else {
			policyPrice+=20 ;
		}
		
		///////////////////////////////////////////////////////////
		System.out.println("How is this vehicle primarily used?");
		String answer3 = sc.next();
		
		if (answer3.equalsIgnoreCase("business")) {
			policyPrice+=50 ;
		}else if (answer3.equalsIgnoreCase("pleasure")) {
			policyPrice+=10 ;
		}else if (answer3.equalsIgnoreCase("commute")) {
			policyPrice+=20 ;
		}
		////////////////////////////////////////////////////////
		System.out.println("Days Driven To Work And/Or School?");
		int answer4 = sc.nextInt();
		policyPrice+= (answer4 * 5) ;
		////////////////////////////////////////////
		System.out.println("Miles Driven To Work And/Or School?");
		double answer5 = sc.nextDouble();
		int answer5rounded = Math.round(answer4) ;
		policyPrice+= answer5rounded ;
		//////////////////////////////////////////
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		if (age<16) {
			System.out.println("invalid data");
			System.exit(0);
		}else if (age>=16 && age<=18) {
			policyPrice = policyPrice *20 ;
		}else if (age>18 && age<=21) {
			policyPrice = policyPrice * 6 ;
		}else if (age>21 && age<=25) {
			policyPrice = policyPrice * 2 ;
		}
		//////////////////////////////////////////
		System.out.println("Enter your experince");
		int experience = sc.nextInt();
		
		if (experience<=0) {
			System.out.println("invalid data");
			System.exit(experience) ;
		}
		
		if ( (age-experience) <=16 ) {
			System.out.println("invalid data");
			System.exit(experience) ;
		}
		
		policyPrice = policyPrice - (experience*5) ;
		////////////////////////////////////////////////
		
		System.out.println("Have you had any accidents in the last 5 years?");
		boolean accident = sc.nextBoolean();
		int accidentAmount ;
		if (accident == true) {
			System.out.println("Amount of accidents?");
			accidentAmount = sc.nextInt();
			policyPrice = policyPrice + ((policyPrice*0.2)*accidentAmount) ;
		}
		///////////////////////////////////////////
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		boolean insurance = sc.nextBoolean();
		
		if (insurance == false) {
			policyPrice = policyPrice*2 ;
		}
		////////////////////////////////////////////////////7
		System.out.println("What is the highest level of education you have completed?");
		String education = sc.next();
		
		if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Master") || education.equalsIgnoreCase("Bachelor")) {
			policyPrice = policyPrice* (0.05) ;
		}else if (education.equalsIgnoreCase("doctor")) {
			policyPrice = policyPrice* (0.1) ;
		}else {
			policyPrice = policyPrice + policyPrice* (0.05) ;
		}
		
		String refNum = "" ;
		refNum = refNum +  name.substring(0, 2) ;
		String ageStr = Integer.toString(age) ;
		refNum = refNum.concat(ageStr) ;
		refNum = refNum.concat(name.substring(name.length()-2)) ;
		String zipStr = Integer.toString(zipCode) ;
		refNum = refNum.concat(zipStr) ;
		refNum = refNum.concat(education);

		
		
		
		
		
		System.out.println("customer, here's your quote!");
		System.out.println("Start Your Policy Today For: $ " + policyPrice);
		System.out.println("Reference number: " + refNum.toUpperCase());
		
		
		
		
		
		
		
	}

}
