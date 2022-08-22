package replit;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter a word");

		String word = sc.nextLine() ;
		
		if (word.length()>5) {
			System.out.println("Too long");
		}
		
		if (word.length()<5) {
			System.out.println("Too short");
		}
		
		if (word.length()==5) {
			
			for (int i= (word.length()- 1) ; i > (-1) ; i--) {
				String dummy = "" + word.charAt(i) ;
				System.out.print(dummy);	
			}
		}
		
	
	}

}
/* Write a program that will reverse a string. 
Your program should reverse a string only 5 characters long. 
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". 
Otherwise, reverse this word and print out result into the console. */
