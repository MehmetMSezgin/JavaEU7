package day30_wrapperClass;

import java.util.Arrays;

public class Task96_celcius_degree {

	public static void main(String[] args) {
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day" ;
		
		String[] array = str1.split("and ") ; //spliting from beginning
		array = array[1].split(" degree") ;  // splitting from end
		
		String degree = array[0] ; // and reaches to 72
		
		double convertedDouble = Double.parseDouble(degree) ; // converts 72 from String to double
		
		double celcius = (convertedDouble -32 ) * 5/9 ;
		
		System.out.println(convertedDouble + " degree is equal to " + Math.round(celcius) + " celcius");
		// Math.round asagi sayiya yuvarlar yani 22.2 yi 22 ye
		
	}

}
