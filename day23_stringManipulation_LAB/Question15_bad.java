package day23_stringManipulation_LAB;

public class Question15_bad {

	public static void main(String[] args) {
		
		hasBad("xbadad");
		hasBad("bax") ;
		hasBad("bad") ;
		hasBad("ba") ;
		
	}

	public static void hasBad (String word) {
		boolean t = true ;
		boolean f = false ;
		
		if (word.length() < 3) {
			System.out.println("invalid");
		}
		
		if (word.length() == 3) {
			if (word.equals("bad")) {
				System.out.println(t); ;
			}else {
				System.out.println(f); ;
			}
		}
		
		
		if (word.length()>3) {
		if (word.substring(0, 3).equals("bad") || word.substring(1, 4).equals("bad") ) {
			System.out.println(t); ;
		}else {
			System.out.println(f); ;
		}
		}
		
	}

}
