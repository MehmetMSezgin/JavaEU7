package day13_methods;

public class LoopCallMethod {

	public static void main(String[] args) {
		System.out.println("main");
		for(int i=0 ; i<5 ; i++) {
			displayMessage() ;
			System.out.println("back to the main");
		}

	}

	public static void displayMessage() {
		
		System.out.println("inner method");
	}

}
