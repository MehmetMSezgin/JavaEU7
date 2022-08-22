package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClasses_important {

	public static void main(String[] args) {
		
		//toString()
		int[] nums = {7,8,512,1,2,3} ;
		System.out.println(Arrays.toString(nums));
		
		//equals()
		int [] num1 = {3,5,7} ;
		int [] num2 = {3,5,7} ;
		System.out.println(Arrays.equals(num1, num2));
		
		//sort() : sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//binarySearch()
		String [] words = {"a" , "b", "c"} ;
		System.out.println(Arrays.binarySearch(words, "b")); // it gives index number
		
		//copyOf()
		double[] d1 = {2,3,4.5} ;
		double[] d2 = d1 ;   //!!!!!!!!this is not copying this is reference matching
		
		double[]d3 = Arrays.copyOf(d1, d1.length) ; // this is copying
	}

}
