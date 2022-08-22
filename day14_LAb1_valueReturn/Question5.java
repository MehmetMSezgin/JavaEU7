package day14_LAb1_valueReturn;

public class Question5 {

	public static void main(String[] args) {
		caughtSpeeding(60, false) ;
		caughtSpeeding(65, false) ;
		caughtSpeeding(65, true) ;

	}

	public static void caughtSpeeding(int speed, boolean bday) {
		if (bday) {
			if(speed<=65) {
			System.out.println("0");
			}else if (66<=speed && speed<=85) {
			System.out.println("1");
			}else if (speed>=86) {
			System.out.println("2");
			}
		} else {
			if(speed<=60) {
			System.out.println("0");
			}else if (61<=speed && speed<=80) {
			System.out.println("1");
			}else if (speed>=81) {
			System.out.println("2");
			}
		}
		
		
		
		
		
		
		
		
	}
}
