package day20_stringManipulation_part2;

public class String_equals {

	public static void main(String[] args) {
		
		String s1 = "Hello" ;
		String s2 = "Hello" ;
		String s3 = "hello" ;
		String s4 = " Hello" ;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		String s5 = new String ("Hello") ;
		
		System.out.println(s1==s5); // false --> it checks that is it same object
		System.out.println(s1.equals(s5)); // true --> it checks the content
				
				;
		

		
	}

}
