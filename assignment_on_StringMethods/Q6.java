package assignment_on_StringMethods;

import java.util.Scanner;

public class Q6 {

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
