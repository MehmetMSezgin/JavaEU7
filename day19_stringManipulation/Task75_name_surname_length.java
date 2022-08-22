package day19_stringManipulation;

import java.util.Scanner;

public class Task75_name_surname_length {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
			
		System.out.print("Please enter your name/surname:");
		
		String input = sc.nextLine() ; //between name and surname there is space you must use nextLine
		
		System.out.println(input.length());
		
		

	}

}
