package Lab4_Arrays;

import java.util.Scanner;

public class Q2_lengthArray_method {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("create an array");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt(); 
		
		int[] x = {a,b,c} ;
		System.out.println(checkLength(x));	
		 
	}
	
	public static boolean checkLength (int[] array) {
		
		if (array.length<1) {
			System.out.println("not valid array");
		}
		
		if(array[0]==array[(array.length-1)]) {
			return true ;
		}else {
			return false ;
		}
	}

}
