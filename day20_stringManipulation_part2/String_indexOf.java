package day20_stringManipulation_part2;

public class String_indexOf { //starts counting from 0

	public static void main(String[] args) {
		String word1 = "github" ;
		
		int i = word1.indexOf("g") ;
		System.out.println(i);
		System.out.println(word1.indexOf("i")); // string 
		System.out.println(word1.indexOf('i')); // or char
		
		String word2 = "Java , c++ , pyhton" ;
		
		if (word2.indexOf("c++") > -1) {
			System.out.println("it is here");
		//////////////////////////////////////////////////////////////77	
			
		String word3 = "html-seleniu-grid-hxtml-number3" ;	 //it will start checking from back ,so from 3
		System.out.println(word3.lastIndexOf("-"));
			
		}
	}

}
