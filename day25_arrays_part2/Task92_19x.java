package day25_arrays_part2;

import java.util.Arrays;

public class Task92_19x {

	public static void main(String[] args) {
		
		int num[] = new int[10] ;
		
		for (int i = 0 ; i<10 ; i++) {
			num[i] = (i+1)*19 ;
			System.out.println(num[i]);
		}
		System.out.println(Arrays.toString(num));
		// Arrays.toString method gives all assigned arrays
	}

}
