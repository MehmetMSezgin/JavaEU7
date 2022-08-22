package day36_staticClassMembers;

public class calculator_method {

	public static void main(String[] args) {
		
		double result = Calculator.plus(1, 2) ;
		// you call call directly (static way)
		
		Calculator c = new Calculator() ;
		c.plus(1, 2) ;
		//or you can create an object

	}

}
