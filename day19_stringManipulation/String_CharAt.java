package day19_stringManipulation;

public class String_CharAt { // it checks only specific exactly char in exactly line

	public static void main(String[] args) {
		
		String str = "abc def" ;
		
		System.out.println(str.charAt(0)); //!!!!!!!it starts counting from zero "0" !!!!!!!!!!!
		System.out.println(str.charAt(1));  // !!!! do not forget !!!!!
		System.out.println(str.charAt(4));  // it doesn't count space this time
		System.out.println(str.charAt(5));
		///////////////////////////////////////
		// check first and last characters are same
		String word = "civic" ;
		
		if (word.charAt(0) == word.charAt(4)) {
			System.out.println("same");
		}else {
			System.out.println("no");
		}
		
		//////////////////////////////////////
		
		String word2 = "Java" ;
		
		char lastChar = word2.charAt(word2.length()-1) ;
		
		System.out.println("Last char of " + word2 + " is " + lastChar);
		


	}

}
