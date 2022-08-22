package day25_arrays_part2;

public class Return_method_array {

	public static void main(String[] args) {
		
		 
		for (double value :getArray()) {
			System.out.println(value);
		}
	}

	public static double[] getArray() {
		
		double[] array = {1,2,3} ;
		
		return array ;
	}

}
