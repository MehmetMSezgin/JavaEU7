package day15_methods_part3;

public class task67_LastDigit {

	public static void main(String[] args) {
		
		if (lastDigit(3,17)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	
	}

	public static boolean lastDigit(int num1, int num2) {
		
		if ((num1%10)==(num2%10)) {
			return true ;
		} else 
			return false;
	}

}
