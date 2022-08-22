package day23_stringManipulation_LAB;

import java.util.Random;

public class Tassk84_headOrTails {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
			for (int i= 0 ; i<10 ; i++) {
				
				boolean result = rn.nextBoolean() ;
				if (rn.nextBoolean() == true) {
					System.out.println("Tails");
				}else {
					System.out.println("Heads");
				}
				
			}
			
	}

}
