package day25_arrays_part2;

public class SameArray {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3};
		int[] array2 = array1 ;
		
		array1[0] = 200 ;  //index0 was 1 but I referenced again
		array2[2] = 400 ; //when I make changes in array2 , it effects also array 1
		//Because they are referencing same object
		
		for (int i : array1) {
			System.out.println(i);
		}

	}

}
