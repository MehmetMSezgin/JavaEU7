package day30_wrapperClass;

public class variable_argument {

	public static void main(String[] args) {
		sum(2,4) ;
		sum(1,2,3,4,5) ;
	}
	
	public static void sum (int... numbers) { //whatever you put here it converts to array for us
		int sum=0 ;
		
		for(int value: numbers) {
			sum= sum+ value ;
		}
		System.out.println(sum);
	}

}
