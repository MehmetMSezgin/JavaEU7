package day22_stringManipulation_LAB;

public class Question5_WooHoo {

	public static void main(String[] args) {
		
		String s1 = firstHalf("WooHooo") ;
		System.out.println(s1);
	}

	public static String firstHalf(String word) {
		
		return word.substring(0 ,word.length()/2) ;
		
	}

}
