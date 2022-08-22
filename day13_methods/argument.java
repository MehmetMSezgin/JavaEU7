package day13_methods;

public class argument {

	public static void main(String[] args) {
		
		
		displayValue(5); //you need to define a argument which is 5
						//or
		int x=5 ;
		displayValue(x); //or
		
		displayValue(x*4);
	}

	public static void displayValue(int num) {	//this name which is "num" // "=" yok!!!!!!
		System.out.println("value " + num);	//and this name which is "num" must match
	}

}
