package day22_stringManipulation_LAB;

public class Question2_abba {

	public static void main(String[] args) {
		

		System.out.println(makeAbba("Hi" , "Bye"));
	}

	public static String makeAbba(String a, String b) {
		
		return a.concat(b).concat(b).concat(a) ;
		
	}

}
