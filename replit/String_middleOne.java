package replit;

import java.util.*;

public class String_middleOne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    
	    System.out.println("Please enter a word");
	    
	    if (!(word.length()%2 == 0)) {
	    	if (word.length()>2) {
	    		int findMiddle = word.length()/2 ;
	    		System.out.println(word.charAt(findMiddle));
	    	}else if (word.length()==1) {
	    		System.out.println(word.concat(word).concat(word));
	    	}
	    }
	    
	    if (word.length()%2 == 0) {
	    	if (word.length()>=4) {
	    		int findMiddle2 = word.length()/2 ;
	    		System.out.println(word.charAt(findMiddle2-1)+ "" +  word.charAt(findMiddle2));
	    	}else if (word.length()==2) {
	    		System.out.println(word.concat(word));
	    	}
	    }
	    
	    
	    
	}

}
/*When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
     #$%^&* ==> %^
2 characters, print those 2 characters twice */