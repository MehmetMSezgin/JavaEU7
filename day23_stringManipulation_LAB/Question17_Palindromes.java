package day23_stringManipulation_LAB;

public class Question17_Palindromes {

	public static void main(String[] args) {
		
		Palindromes("wow") ;
		Palindromes("Racecar") ;	// equalsIgnoreCase is used for this example
		Palindromes("madam") ;	
		Palindromes("taco cat") ;	// replace(" ", "") is used for this example

	}

	public static void Palindromes(String word) {
		
		String backWord = "" ;
		
		for (int i= word.length() -1 ; i >= 0 ; i--) { //word.length - 1 = gives last index number
			
			backWord = backWord + word.charAt(i) ;
				
		}
	 	if (word.replace(" ", "").equalsIgnoreCase(backWord.replace(" ", ""))) {
	 		System.out.println(true);
	 	}else {
	 		System.out.println(false);
	 	}
		
	} 

}
