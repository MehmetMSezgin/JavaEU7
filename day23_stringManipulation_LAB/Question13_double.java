package day23_stringManipulation_LAB;

public class Question13_double {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("Programming is fun"));
		System.out.println(doubleChar("work work work!!!"));
		System.out.println(doubleChar("disrupted text"));
	}

	public static String doubleChar(String word) {
		
		String dummy = "" ;
		for (int i=0 ; i< word.length() ; i++) {
			
			dummy = dummy + word.substring(i, i+1).concat(word.substring(i, i+1)) ;
			
		}
		return dummy ;
	}

}
