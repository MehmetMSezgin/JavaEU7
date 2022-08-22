package day25_arrays_part2;

public class PassElements_method_arrays {

	public static void main(String[] args) {
		
		int [] numbers = {5,10,15,20,25}; //creating of Array
		
		for (int value : numbers) {
			showValue(value) ; // pass the array to the method
		}
		
		
	}

	public static void showValue(int n) {   // n=value
		System.out.println(n + " ");
		
	}

}
