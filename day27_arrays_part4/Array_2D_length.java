package day27_arrays_part4;

public class Array_2D_length {

	public static void main(String[] args) {
		int [][] numbers = {
				{1,2,3,4},
				{5,6},
				{7,8,9,10,11}
				};
		
		for (int i=0 ; i<numbers.length ; i++) {
			System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
		}
		///////////////////////////////////////////////////////////////////
		for (int i=0 ; i<numbers.length ; i++) {
			for (int y=0 ; y<numbers[i].length ; y++) {
				System.out.println(numbers[i][y]);
			}
		}
	}

}
