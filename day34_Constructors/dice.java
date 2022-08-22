package day34_Constructors;

import java.util.Random;

public class dice {
		
		int sides;
		int value ;
		
		public dice(int numSides) {
			sides= numSides ;
		}
		
		public void roll() {
			Random rand = new Random();
			value = rand.nextInt(sides) +1 ;
			
		}
		
		public int getSides () {
			return sides ;
		}
		
		public int getValue () {
			return value ;
		}
}
