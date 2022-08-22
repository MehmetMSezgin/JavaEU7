package day24_arrays_part1;

public class Array_loop_sum {

	public static void main(String[] args) {
		
		int[] scores = {12,4,3,45,34,34,523,52,34,325,43,64,5,32,324,3,43,6,436,546,45,64,57,124,1245} ;
		int sum = 0 ;
		
		for (int i=0 ; i<scores.length ; i++) {
			sum = sum + scores[i] ;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Avarage: " + (sum/scores.length)) ;
		
		
		
	}

}
