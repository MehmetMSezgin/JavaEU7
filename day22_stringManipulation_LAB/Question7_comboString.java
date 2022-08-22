package day22_stringManipulation_LAB;

public class Question7_comboString {

	public static void main(String[] args) {
		
		System.out.println(comboString("hello" , "hi"));
		System.out.println(comboString("ho" , "hi"));
	}

	public static String comboString(String s1, String s2) {
		
		if (s1.length()==s2.length()) {
			return "equal" ;
		}
		
		if (s1.length()>s2.length()) {
			return s2.concat(s1).concat(s2) ;
		}else {
			return s1.concat(s2).concat(s1) ;
		}
		
	}

}
