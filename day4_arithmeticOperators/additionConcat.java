package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		// Number+ Number = Addition
		// Number + String = Concetenation
		// Number + Booean = Concetenation
		System.out.println(1+1);
		System.out.println(1+1+ "\"hello\"");
		
		System.out.println(1+1 + "M" + (1+1));
		// 1+1=2 , 2+M=2M, 2M+2=2M2
		/* stringten sonra toplamaya devam etmek istiyorsan
		   paranteze al  */
		
		System.out.println(1+1 + "M" + 1+1);
		// 1+1=2 , 2+M=2M, 2M+1=2M1, 2M1+1=2M11
		
		System.out.println("m"+(1+2+3));
		// m+1=m1, m1+2=m12, m12+3=m123
		


	}

}
