package day14_LAb1_valueReturn;

public class Question3 {

	public static void main(String[] args) {
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);

	}

	public static void specialEleven(double number) {
		if ((number%11==0) || ((number-1)%11==0)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
