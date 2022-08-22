package day19_stringManipulation;

public class Task78_countSpecificChar {

	public static void main(String[] args) {
		
		String str = "abcabcabc" ;
		
		char myChar = 'a' ;
		
		int counter = 0 ; // dumy variable
		
		for (int i = 0 ; i< str.length() ; i++) {
			if (str.charAt(i) == myChar) {
				counter++ ;
			}
		}
		
		System.out.println(myChar + " is " + counter);
	}

}
