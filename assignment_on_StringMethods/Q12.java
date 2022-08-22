package assignment_on_StringMethods;

public class Q12 {

	public static void main(String[] args) {
		
		String word = "apple" ;
		String first = word.substring(0 , 1) ;
		String last = word.substring(word.length()-1,  word.length()) ;
		
		if (first.equalsIgnoreCase("x") || last.equalsIgnoreCase("x")) {
			
			if (first.equalsIgnoreCase("x") && last.equalsIgnoreCase("x")) {
				System.out.println(word.substring(1, word.length()-1));
			} else if (first.equalsIgnoreCase("x")) {
				System.out.println(word.substring(1, word.length()));
			}else if (last.equalsIgnoreCase("x")) {
				System.out.println(word.substring(0, word.length()-1));
			}
		}else {
			System.out.println(word);
		}
		
		

	}

}
