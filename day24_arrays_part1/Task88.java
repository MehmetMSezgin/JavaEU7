package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {
		
		String cars[] = new String[7] ;
		
		cars[0] = "toyota" ;
		cars[1] = "honda" ;
		cars[2] = "nissan" ;
		cars[3] = "bmw" ;
		cars[4] = "mercedes" ;
		cars[5] = "porsche" ;
		cars[6] = "ferrari" ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Choose your dream car");
		int input = sc.nextInt() ;
		
		Random rn = new Random() ;
		int random1 = rn.nextInt((40000-20000)+1) + 20000 ; // I want a number between 20k-40k
		int random2 = rn.nextInt((80000-50000)+1) + 50000 ;// I want a number between 50k-80k
		int random3 = rn.nextInt((150000-100000)+1) + 100000 ;// I want a number between 100k-150k
		
		
		if (input<=2) {
		System.out.println("Your car model is " + cars[input] + " and the price is apprx " + random1);
		} else if (input==3 || input==4) {
		System.out.println("Your car model is " + cars[input] + " and the price is apprx " + random2);
		} else if (input==5 || input==6) {
		System.out.println("Your car model is " + cars[input] + " and the price is apprx " + random3);
		}

	}

}
