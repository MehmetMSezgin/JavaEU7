package day13_methods;

public class deep_deeper {

	public static void main(String[] args) {
		System.out.println("main");
		deep() ;
		System.out.println("back main");

	}

	public static void deeper() {
		System.out.println("inside of deeper");
	}

	public static void deep() {
		System.out.println("deep");
		deeper() ; //inside method you can call another method	
		System.out.println("deeper");
	}
          // IMPORTANT : when compiler is done with deeper, it turns back to deep
		  //	after it is done with deep , that time it goes to main
}
