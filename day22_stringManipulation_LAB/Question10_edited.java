package day22_stringManipulation_LAB;

public class Question10_edited {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited")); 
		System.out.println(frontAgain("ed")); 


	}

	public static Boolean frontAgain(String word) {
		boolean t = true ;
		boolean f = false ;
		
		String firstTwo = word.substring(0 , 2) ;
		String lastTwo  = word.substring(word.length()-2) ;
		
		if (firstTwo.equals(lastTwo)) {
			return t ;
		} else {
			return f ;
		}
		
	}

}
