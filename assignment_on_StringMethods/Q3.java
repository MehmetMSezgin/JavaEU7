package assignment_on_StringMethods;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		String word;
		
		System.out.println("enter a word");
		word = sc.next();
		
		if (!(word.length()%2 == 0)) {
			if (word.length()>=3) {
				System.out.println(word.charAt((word.length()-1)/2));
			}else if (word.length()==1) {
				System.out.println(word.concat(word).concat(word));
			}
		}else {
			if (word.length()>=4) {
				String newWord = word.substring( (word.length()/2)-1, (word.length()/2)+1 ) ;
				System.out.println(newWord);
			} else if (word.length()==2) {
				System.out.println(word.concat(word));
			}
		}

	}

}
