package day3_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		byte b1= 25 ;
		byte b2= -25;
		System.out.println("b1=" + b1 + b2);
		
		
		short s1= -32768;
		System.out.println(s1);
		
		int i1= 100000;
		int i2= 100_000;
		System.out.println(i1  );
		System.out.println( i2 );
		//i1 and i2 same 
		
		long l1= 2139129309L;
		/*"L" or "l" sign is mandatory we need to force this variable
		 to be long */
		System.out.println("long value=" + l1);
		
		//floating numbers are default double
		//So we need to force to make it float(if it it small amount)
		float f1= 2.1f;
		System.out.println("f1 value " + f1);
		
		double d1= 213123.14;
		System.out.println(d1);
		
		char c1= 'A'  ;
		char c2= 65; //Decimal value corresponding to character A
		//For different character Unicode list can be used
		
		boolean status= true;
		boolean status2= false;
		System.out.println("Exam result is " + status + " or "+ status2);
		
		String name = "Muki";
		System.out.println("my name is " + name);
		String age= "29";
		//only String is big letter
		
	}

}
