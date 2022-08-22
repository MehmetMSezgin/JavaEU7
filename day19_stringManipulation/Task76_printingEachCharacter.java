package day19_stringManipulation;

public class Task76_printingEachCharacter {

	public static void main(String[] args) {
		
		String str = "Cybertek School" ;
		
		for (int i=0 ; i<str.length() ; i++) { //Last character index is Always length-1
			System.out.println(str.charAt(i));
		}

	}

}
