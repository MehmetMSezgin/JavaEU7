package day24_arrays_part1;

import java.util.Scanner;

public class Task87 {

	public static void main(String[] args) {
		
		String[] days = new String[7] ;
		
		days[0] = "Manan" ;
		days[1] = "tiis" ;
		days[2] = "keski" ;
		days[3] = "tors" ;
		days[4] = "per" ;
		days[5] = "launan" ;
		days[6] = "sunnun" ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter number");
		
		int input = sc.nextInt() ;
		System.out.println(days[input]);


	}

}
