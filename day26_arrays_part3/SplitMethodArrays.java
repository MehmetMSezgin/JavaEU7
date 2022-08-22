package day26_arrays_part3;

public class SplitMethodArrays {

	public static void main(String[] args) {
		
		String str = "it will display the array of the size" ;
		
		String[] array = str.split(" ") ; // it separates when it finds " " (empty) 
		// String[] array = { "it" , "will" , "display" , "the" , "array" , "of" , "the" , "size" } ;

		
		for (String value : array) {
			System.out.println(value);
		}
		

	}

}
