package day25_arrays_part2;

public class for_each_loop {

	public static void main(String[] args) {
		
		String[] alphabet = {"a" , "b" , "c"};
		
		for (String output : alphabet) { //this way can be used for arrays
			System.out.println(output);	// this "output" can be any name I just give. It is not special syntax
		}
		
		int[] numbers = {1,4,5,6,235,325,4,642,64,643,6,43};
		for(int output : numbers) {
			System.out.println(output);
		}
		
		// 	PRINT ALPHABET REVERSE
		for (int i=alphabet.length-1 ; i>=0 ; i--) {
			System.out.println(alphabet[i]);
		}
		
	}

}
