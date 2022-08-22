package assignment_on_StringMethods;

public class Q5 {

	public static void main(String[] args) {
		mixer ("aok" , "lol") ;

	}
	
	public static void mixer (String word1 , String word2) {
		
		if ( !((word1.length())==3) || !((word2.length())==3) )  {
			System.out.println("cannot merge");
		}
		
		String newWord = "" ;
		for (int i= 0 ; i<3 ; i++) {
			newWord = newWord + ( word1.charAt(i) ) + ( word2.charAt(i) ) ;
		}
		System.out.println(newWord);
		
	}

}
