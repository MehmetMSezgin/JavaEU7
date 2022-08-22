package day13_methods;

public class calculator_task60 {

	public static void main(String[] args) {
		calculator(6 , 3 , "*") ;
		calculator(6 , 3 , "+") ;
		calculator(6 , 3 , "-") ;
		calculator(6 , 3 , "/") ;

	}

	public static void calculator(double x , double y , String z ) {
		switch (z) {
			case "+" :
				System.out.println(x+y);
				break;
			case "-" :
				System.out.println(x-y);
				break;
			case "*" :
				System.out.println(x*y);
				break;
			case "/" :
				System.out.println(x/y);
				break;
		}
		
	}

}
