package day23_stringManipulation_LAB;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random r = new Random() ;
		
		
		for (int i = 0 ; i<10 ; i++) {
			int randomNum = r.nextInt(50) ;//0-49
			System.out.println(randomNum);
		}
		
		System.out.println(r.nextInt()); 

	}

}
