package day22_stringManipulation_LAB;

public class Question8_rotatedLeft2 {

	public static void main(String[] args) {
		
		System.out.println(left2("java"));
		

	}

	public static String left2(String s1) {
		
		if (s1.length()<2) {
			return "invalid" ;
		}
		
		String dummy = s1.substring(0 , 2) ;
		return s1.substring(2) + dummy ;
	}

}
