package replit;

import java.util.Scanner;

public class Split_Sentence {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("type something");
		 
		 String sentence = input.nextLine();

		 
		 String[] array = sentence.split(" ") ;
		 
		 for (String value : array) {
			 System.out.println(value);
		 }

	}

}
