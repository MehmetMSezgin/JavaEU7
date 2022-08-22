package day24_arrays_part1;

import java.util.Scanner;

public class Task86 {

	public static void main(String[] args) {
		
		String[] months = new String[12] ;
		
		months[0] = "Jan" ;
		months[1] = "Feb" ;
		months[2] = "March" ;
		months[3] = "Ap" ;
		months[4] = "May" ;
		months[5] = "June" ;
		months[6] = "July" ;
		months[7] = "Aug" ;
		months[8] = "Sep" ;
		months[9] = "Oct" ;
		months[10] = "Nov" ;
		months[11] = "Dec" ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter the number");
		
		int input = sc.nextInt() - 1 ;
		
		System.out.println("The month name is " + months[input]);



	}

}
