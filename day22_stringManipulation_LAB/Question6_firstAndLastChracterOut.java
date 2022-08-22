package day22_stringManipulation_LAB;

public class Question6_firstAndLastChracterOut {

	public static void main(String[] args) {
		
		System.out.println(withoutEnd(""));

		System.out.println(withoutEnd("coding"));


	}

	public static String withoutEnd(String word) {
		
		if (word.length()<2) {
			return "it should be at least 2" ;
		}
		
		return word.substring(1, word.length()-1) ;
	}

}
