package day30_wrapperClass;

public class Some_wrapper_class_methods {

	public static void main(String[] args) {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Character.isAlphabetic('a')); // returns true
		System.out.println(Character.isAlphabetic('1')); // returns false
		
		System.out.println(Character.isLetter('j')); // returns true
		System.out.println(Character.isLetter('&')); // returns false
		
		System.out.println(Character.isDigit('5')); // returns true
		System.out.println(Character.isDigit('a')); // returns false
		
		String word= "java101" ;
		System.out.println(Character.isAlphabetic(word.charAt(0))); // returns true
		System.out.println(Character.isDigit(word.charAt(4))); // returns true




		
	}

}
