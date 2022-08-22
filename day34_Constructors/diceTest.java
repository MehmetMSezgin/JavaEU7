package day34_Constructors;

public class diceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES = 6 ;
		dice sixDice = new dice(SIX_SIDES);
		
		rollDice(sixDice);
		// sixDice=d
	}
	
	public static void rollDice(dice d) { //I use object as reference variable
		d.roll(); // I call roll because I want random number
		//rolling 6 sided dice
		System.out.println("rolling a " + d.getSides() + " sided dice"); 
		//sixDice= d actually it is calling sixDice.getSides()
		//the dice's value 5
		System.out.println("the dice's value: " + d.getValue());
	}

}
