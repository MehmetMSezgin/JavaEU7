package day22_stringManipulation_LAB;

public class Question1_helloBob {

	public static void main(String[] args) {
		
		helloName("Bob") ;
		helloName("Alice") ;
		helloName("x") ;



	}

	public static void helloName(String name) {
		
		System.out.println("Hello ".concat(name).concat("!"));
		
	}

}
