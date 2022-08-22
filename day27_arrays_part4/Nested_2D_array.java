package day27_arrays_part4;

import java.util.Arrays;

public class Nested_2D_array {

	public static void main(String[] args) {
		
		int[][] numbers = {{1,2,3,4}, {2,45,23,24642,3}, {123,12,1,2,34,32}} ; //each row is an array
		
		for (int i=0 ; i<numbers.length ; i++) {
			for (int j=0 ; j<numbers[i].length ; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		String[][] words = {{"apple", "banana"}, {"mango","watermelon"}} ;
		
			System.out.println("***********");
			System.out.println("***FOR EACH LOOP***");
		for(String[] value : words) { // understand deeply this loop and next one!! // it shows rows
			System.out.println(Arrays.toString(value)); //important!!!
		}
	/////////////////////////
		for(String value : words[1]) { // just inside of row 1
			System.out.println(value);
		}
	////////////////////////
		
	

	}

}
