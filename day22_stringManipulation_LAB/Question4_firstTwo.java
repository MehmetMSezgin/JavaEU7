package day22_stringManipulation_LAB;

public class Question4_firstTwo {

	public static void main(String[] args) {
		
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("a"));
	}
	public static String firstTwo(String s1) {
		if (s1.length()==1) {
			return s1 ;
		}
		
		if (s1.equals("")) {
			return s1 ;
		}
		
		String dummy = "" ;
		return dummy = s1.substring(0, 2) ;
	}

}
