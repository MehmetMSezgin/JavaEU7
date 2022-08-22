package replit;

import java.util.Scanner;

public class String_examples {
  
	public static void main(String[] args) {
    //DO NOT CHANGE
    
    String word = "Java";
    //WRITE YOUR CODE HERE
    System.out.println("Please type a word");
    System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));
    /////////////////////////////////////////////////////
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Please enter the text");
    String typedWord = sc.nextLine() ;
    System.out.println("Length is: " + typedWord.length());
    /////////////////////////////////////////////////////
    String word1 = sc.next();
    String word2 = sc.next();
    
    System.out.println("Please type your first word");
    System.out.println("Please type your second word");
    System.out.println(word1.concat(word2).concat(word2).concat(word1));

    
  }
}
