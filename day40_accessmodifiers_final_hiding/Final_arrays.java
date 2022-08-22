package day40_accessmodifiers_final_hiding;

public class Final_arrays {

	public static void main(String[] args) {
		
		final int[] Teams = {11,11} ;
		System.out.println(Teams[0]);
		Teams[0] = 15 ; //it can be changed
		
		int nums[] = new int[] {3,4,5} ;
		nums = new int[] {10,20,30} ;
		
		final int[] finalNums = {1,2};
		//finalNums = new int[] {0,0}; you can refer another reference anymore
	}

}
