package day18_readingUserInput;

import java.util.Scanner;

public class Task73_Guess_number {

	public static void main(String[] args) {
		
		int userInput ;
		int secretNumber= 8 ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("enter a number: ");
		
		do {
			userInput = sc.nextInt() ;
			
			if (userInput< secretNumber) {
				System.out.println("choose bigger");
			}else if (userInput>secretNumber) {
				System.out.println("choose smaller");
			} else {
				System.out.println("congrats you got it!");
			}
			
		}while (userInput != secretNumber) ;
	
	}

}
