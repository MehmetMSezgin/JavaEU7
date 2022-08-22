package assignment_on_StringMethods;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		String word;
		
		System.out.println("enter a word");
		word = sc.next();
		
		if (!(word.length()%2 == 0) && word.length()>=5) {
			String newWord = word.substring( ((word.length()-1)/2)-1   , ((word.length()-1)/2)+2  ) ;
			System.out.println(newWord);
		}else {
			System.out.println("invalid");
		}

	}

}
