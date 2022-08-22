package Assignment_Arithmetic_Operators;

public class Arithmetic_Operators {

	public static void main(String[] args) {
	
	converter(15);
	rectangle(3, 4);
	swapValues(10, 20);
	ChangeMaker(98);

	}
	
	//Question 1
	public static void converter (double gallon) {
		double liter=0 ;
		
		liter = gallon* (3.78) ;
		liter = Math.round(liter);
		System.out.println(gallon +" gallon is "+ liter +" liter");
	}
	
	//Question 2
	public static void rectangle (double width, double height) {
		double area;
		area = width * height;
		System.out.println(area);	
	}
	
	//Question 3
	public static void swapValues (int num1 , int num2) {
		int num3=0;
		num3= num1;
		num1= num2;
		num2= num3;
		System.out.println(num1 +" "+ num2);
	}
	
	//Question 4
	public static void ChangeMaker (int b1) {
		int originalB1= b1 ;
		
		int quarter = (b1/25) ;
		b1= b1%25 ;
		int dimes = (b1/10)  ;
		b1= b1%10 ;
		int nickles = (b1/5) ;
		b1 = b1%5 ;
		int pennies = (b1/1) ;
		b1 = b1%1 ;
		
		System.out.println(originalB1 + " is given");
		System.out.println(quarter + " quarter");
		System.out.println(dimes + " dimes");
		System.out.println(nickles +  " nickles");
		System.out.println(pennies + " pennies");
	}

	

}
