package day30_wrapperClass;

public class Parsing_Values_from_String {

	public static void main(String[] args) {
		// String---> int //
		String numberAsString = "2021" ;
		System.out.println(numberAsString); // string
		
		int number = Integer.parseInt(numberAsString) ;
		System.out.println(number); // int --->number
		
		System.out.println(numberAsString + 1); //concat
		System.out.println(number + 1); //addition
		////////////////////////////////////////////////////////////////
		// int ---> String //
		int i = 10 ;
		String s = String.valueOf(i) ;
		//or
		String s2 = Integer.toString(i) ;
	
	}

}
