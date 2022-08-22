package day21_stringManipulation_part3;

public class String_trim {

	public static void main(String[] args) {
		String s1 = "           Programming is fun              " ;
		System.out.println(s1.trim());
		
	/////////////////////////////////////////
		String s2 = " 342 " ;
		System.out.println("|" + s2.substring(1, 4).concat("|") );
		System.out.println(s2.replace(" ", "|"));

	}

}
