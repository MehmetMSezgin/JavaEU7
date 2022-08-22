package Assignment_on_OOP_Concepts.Q2;

public class LameCalculator {
		public int num1;
		public int num2;
		
		public int plus(int num1, int num2) {
			return num1+num2;
		}
		
		public int minus(int num1, int num2) {
			return num1-num2;
		}
		
		public int multiply(int num1, int num2) {
			return num1*num2;
		}
		
		public double divide(double num1, double num2) {
			return num1/num2;
		}
		/////////////////////////////////
		public static void main(String[] args) {
			LameCalculator lc = new LameCalculator();
			System.out.println(lc.plus(1, 1));
			System.out.println(lc.minus(1, 3));
			System.out.println(lc.multiply(2, 1));
			System.out.println(lc.divide(3, 2));

		}
		
}
