package day15_methods_part3;

public class Task70_HighScore {

	public static void main(String[] args) {
		
		displayHighScorePosition ("muki" , 780);
		displayHighScorePosition("mike", calculateHighScorePosition(350)); 
											// this is another method
	}

	public static void displayHighScorePosition(String name, int score) {
		
		int finalposition = calculateHighScorePosition(score) ;
		System.out.println(name + " managed to get position " +  finalposition + " on the table");
		
	}
	
	public static int calculateHighScorePosition (int score) {
		int position = 0 ;
		if (score>=1000) {
			position = 1 ;
		} else if ((score>=500 && score < 1000)) {
			position = 2 ;
		} else if ((score>=100 && score<500)) {
			position = 3 ;
		} else {
			position = 4 ;
		}
		return position;
	}

}
