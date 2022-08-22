package Assignment_on_Array;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Search for character");
		char c = sc.next().charAt(0);
		
		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};

		for (int i=0 ; i<arr.length ; i++ ) {
			if (arr[i] == c) {
				System.out.println(c + " found");
				break;
			}else if (arr[i] !=c && i==arr.length-1  ) {
				System.out.println(c + " not found");
			}
		}
		

	}

}
