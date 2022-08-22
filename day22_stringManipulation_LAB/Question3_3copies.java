package day22_stringManipulation_LAB;

public class Question3_3copies {

	public static void main(String[] args) {
		
		System.out.println(extraEnd("hello"));
		System.out.println(extraEnd("a"));

	}

	public static String extraEnd(String word) {
		
		if (word.length()<2) {
			return "invalid String" ;
		}
		return word.substring(word.length()-2).concat(word.substring(word.length()-2)).concat(word.substring(word.length()-2)) ;
	}

}
