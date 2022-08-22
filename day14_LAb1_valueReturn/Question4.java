package day14_LAb1_valueReturn;

public class Question4 {

	public static void main(String[] args) {
		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);

	}

	public static void deerPlay(int i, boolean Summer) {
		if ((60<i && i<90)) {
			System.out.println(true);
			
		}else if ((60<i && i<100) && Summer) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}

}
