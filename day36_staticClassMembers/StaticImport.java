package day36_staticClassMembers;

import static java.lang.Math.*; //packageName.className.elements(variables or methods)

import java.util.*; //packageName.className
 
public class StaticImport {


	public static void main(String[] args) {
			
			
			
			System.out.println(Math.sqrt(16)); // here even if you do not import lang class, it automatically imports
			
			System.out.println(sqrt(16)); //when you import class , no need for Math.
			
			System.out.println(PI); //if you import this class you do not need to use Math.

		}

	
}
