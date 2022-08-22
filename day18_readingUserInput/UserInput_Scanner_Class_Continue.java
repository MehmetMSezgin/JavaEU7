package day18_readingUserInput;

import java.util.Scanner; //!!!! [1] Do not forget to bring this package
						// Correct line --- package -> import -> class
// import java.util.*; // This means bring all inside of java.util classes

public class UserInput_Scanner_Class_Continue {

	public static void main(String[] args) {
		
		Scanner writeAnInput = new Scanner (System.in) ;  // [2] do not forget
		
		System.out.print("Enter a byte value: "); // This is print NOT println
		
		byte b1 = writeAnInput.nextByte() ; //byte and nextByte should match
		// you should assign this method to any value
		
		System.out.println(b1);
		System.out.println(b1*10);
		System.out.println(b1%3 + 3*b1);
		/////////////////////////////////////////////////////////////
		System.out.print("enter a short value ");  //enter value line is print
		short s1 = writeAnInput.nextShort() ;
		System.out.println("your short value " + s1);
		///////////////////////////////////////////////////////////
		System.out.print("enter int ");
		int i1 = writeAnInput.nextInt() ;
		System.out.println("your int " + i1);
		///////////////////////////////////////////////////////////
		System.out.print("enter boolean ");
		boolean bo1 = writeAnInput.nextBoolean() ;
		System.out.println("your boolean " + bo1);
		///////////////////////////////////////////////////////////
		
		writeAnInput.nextLine() ; // bunu ekledim cunku listenin uzerinde diger degiskenler var . cok onemli degil bunu anlamana gerek yok
		System.out.print("enter smth ");
		String str = writeAnInput.nextLine();
		System.out.println(str);

	}

}
