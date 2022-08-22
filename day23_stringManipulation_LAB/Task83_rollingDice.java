package day23_stringManipulation_LAB;

import java.util.*;

public class Task83_rollingDice {

	public static void main(String[] args) {
		
		Random rn = new Random() ;
		Scanner sc = new Scanner(System.in) ;
		int no1 ;
		int no2 ;
		System.out.println("Do you want to roll dice?");
		String answer = "y" ;
		
		while (answer.equalsIgnoreCase("y")) {
			System.out.println("rolling the dice...");
			no1 = rn.nextInt(6) + 1 ; // 1-6
			no2 = rn.nextInt(6) + 1 ;
			
			System.out.println("Their values are " + no1 + " " + no2);
			System.out.println("Roll them again");
			answer = sc.nextLine() ;
			
			}
		
		

	}

}
