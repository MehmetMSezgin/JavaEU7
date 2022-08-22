package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		
		int workHours[] = new int[5] ;
		double wages[] = new double [5] ;
		
		Scanner sc = new Scanner(System.in) ;
		
		for (int i=0 ; i<workHours.length ; i++) {
			System.out.println("enter the employee " + (i+1) + "'s work hour");
			workHours[i] = sc.nextInt() ;
			
			System.out.println("enter the employee " + (i+1) + "'s wage hourly");
			wages[i] = sc.nextDouble() ;
		} 
		
		for (int i=0 ; i<5 ; i++) {
			System.out.println("Employee " + (i+1) + "'s total wage: " + (workHours[i]*wages[i]));
		}
	}

}
