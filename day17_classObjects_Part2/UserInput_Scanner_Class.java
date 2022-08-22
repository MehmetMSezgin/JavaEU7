package day17_classObjects_Part2;

import java.util.Scanner; //!!!! Do not forget to bring this package
						// Correct line --- package -> import -> class
import java.util.*; // This means bring all inside of java.util classes

public class UserInput_Scanner_Class {

	public static void main(String[] args) {
		
		Scanner writeAnInput = new Scanner (System.in) ;
		
		System.out.print("Enter a byte value: "); // This is print NOT println
		
		byte b1 = writeAnInput.nextByte() ; //byte and nextByte should match
		// you should assign this method to any value
		
		System.out.println(b1);
		System.out.println(b1*10);
		System.out.println(b1%3 + 3*b1);
	

	}

}
