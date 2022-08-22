package day23_stringManipulation_LAB;

import java.util.*;


public class MathTutor {

	public static void main(String[] args) {
		
		int no1 ;
		int no2 ;
		int sum ;
		int userAnswer ;
		
		Scanner sc = new Scanner(System.in) ;
		Random rn = new Random() ;
		
		no1 = rn.nextInt(100) ;
		no2 = rn.nextInt(100) ;
		
		System.out.println("what is the answer");
		
		System.out.println(no1 + " + " + no2 + " =?");
		
		userAnswer = sc.nextInt() ;
		sum = no1 + no2 ;
		
		if (userAnswer == sum) {
			System.out.println(true);
		}else {
			System.out.println("wrong! Answer is " + sum);
		}
		
	}

}
