package day23_stringManipulation_LAB;

public class Question14_endingWithLy {

	public static void main(String[] args) {
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("interestingly"));
		System.out.println(endsLy("gravely"));
		System.out.println(endsLy("really"));
		System.out.println(endsLy("oddliy"));


	}

	public static boolean endsLy(String word) {
		
		if(word.length()<2) {
			return false ;
		}
		
		if ( word.substring(word.length()-2).equals("ly") ) {
			return true ;
		}else {
			return false ;
		}
	}

}
