package day21_stringManipulation_part3;

public class String_substring {

	public static void main(String[] args) {
		
		String str = "Java" ;
		
		System.out.println (str.substring(2)) ;
		System.out.println(str.substring(0));
		System.out.println(str.substring(str.length()-1)); 
		//substring(index) starts from 0 but length(counting) from 1
		//////////////////////////////////////////////////////////////
		
		String s1 = "Programming is fun" ;
		
		System.out.println(s1.substring(0, 11)); // it takes 0-10 , 11 is not included
		System.out.println(s1.substring(15,18));
		
		/////////////////////////////////////////////////////////////
		String chars = "{{}}" ;
		String word = "Automation" ;
		
		String s2 = chars.substring(0,2) + word + chars.substring(2) ;
		
		System.out.println(s2);
		

	}

}
