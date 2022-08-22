package day14_LAb1_valueReturn;

public class Question6 {

	public static void main(String[] args) {
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);

	}

	public static void cigarParty(int c, boolean weekend) {
		if (weekend) {
			if (40<=c) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			
		} else {
			if (40<=c && c<=60) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
