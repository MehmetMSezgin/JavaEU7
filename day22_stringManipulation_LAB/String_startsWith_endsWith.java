package day22_stringManipulation_LAB;

public class String_startsWith_endsWith {

	public static void main(String[] args) {
		
		String word1= "eclipse" ;
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("c"));

		System.out.println("///////////////\\\\\\\\\\\\\\");
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("c"));
		
		System.out.println("///////////////\\\\\\\\\\\\\\");

		String word2 = "Programming is fun" ;
		System.out.println(word2.startsWith("Pro"));
		System.out.println(word2.endsWith("fun"));
		

	}

}
