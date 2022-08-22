package day19_stringManipulation;

public class String_concat { // combines specified string at the end of this string

	public static void main(String[] args) {
		
		String s1 = "Java" ;
		String s2 = " world" ;
		String s3 = s1.concat(s2) ;
		
		System.out.println(s3);
		System.out.println(s1.concat(s2));
		
		String s4 = "" ;
		s4 = s1.concat(s2) ;
		System.out.println(s4);
		
		s4 = s1.concat(s2).concat(s3).concat(s4) ;
		System.out.println(s4);
	}

}
