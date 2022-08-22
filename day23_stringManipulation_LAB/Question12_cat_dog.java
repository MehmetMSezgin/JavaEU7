package day23_stringManipulation_LAB;

public class Question12_cat_dog {

	public static void main(String[] args) {
		
		System.out.println(catDog("catdog"));
		System.out.println(catDog("1catsadawddogsadasdcaat"));


	}

	public static boolean catDog(String word) {
		
		int counterCat = 0 ;
		int counterDog = 0 ;
		
		for (int i=0 ; i< word.length()-2 ; i++) {
		
			if (word.substring(i, i+3).equals("cat")) {
				counterCat = counterCat + 1 ; // or counterCat++
			}
			
			if (word.substring(i, i+3).equals("dog")) {
				counterDog = counterDog + 1 ; // or counterDog++
			}
			
		}
		
		if (counterCat==counterDog) {
			return true ;
		} else {
			return false ;
		}
	}

	
	
	
	
	
	
	
}
