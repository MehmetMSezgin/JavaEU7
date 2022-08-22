package day18_readingUserInput;

import java.util.Scanner;

public class Change_maker {

	public static void main(String[] args) {
// Enter a whole number from 1-99 and I will find a combination of coins
// that equals that amount of change
// quarter=25 , dime=10 , nickle=5 , peny=1  
		
		Scanner enterCoin = new Scanner(System.in) ;
		System.out.print("please enter the amount: ");
		int attempt= 0 ;
		
		do {
			int amount = enterCoin.nextInt() ;
		
			if (amount>=1 && amount<=99) {
				ChangeMaker(amount) ;
				break;
			}else {
				attempt++ ;
				if(attempt==3) {
					System.out.println("sorry no more attempt");
					break;
				} else {
					System.out.println("please try again");
				}
				
			}
		}
		while(true) ;
		

	
	}
	
	public static void ChangeMaker (int b1) {
		int originalB1= b1 ;
		
		int quarter = (b1/25) ;
		b1= b1%25 ;
		int dimes = (b1/10)  ;
		b1= b1%10 ;
		int nickles = (b1/5) ;
		b1 = b1%5 ;
		int pennies = (b1/1) ;
		b1 = b1%1 ;
		
		System.out.println(originalB1 + " is given");
		System.out.println(quarter + " quarter");
		System.out.println(dimes + " dimes");
		System.out.println(nickles +  " nickles");
		System.out.println(pennies + " pennies");
	}
	
}
