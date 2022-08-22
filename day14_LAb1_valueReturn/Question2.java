package day14_LAb1_valueReturn;

public class Question2 {

	public static void main(String[] args) {
		
		love6(6, 4);
		love6(4, 5);
		love6(1, 5);
		love6(12, 6);
	}

	public static void love6(int num1 , int num2) {
		
		if (num1==6 || num2==6) {
			System.out.println("love6(" + num1 + "," + num2 + ")" + "-->" + true);
		}else if ((num1+num2==6) || (num1-num2==6) || (num2-num1==6)) {
			System.out.println("love6(" + num1 + "," + num2 + ")" + "-->" + true);
		}else {
			System.out.println("love6(" + num1 + "," + num2 + ")" + "-->" + false);
		}
		
	}

}
