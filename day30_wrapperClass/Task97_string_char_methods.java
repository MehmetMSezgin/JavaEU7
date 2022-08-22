package day30_wrapperClass;

import java.util.Arrays;

public class Task97_string_char_methods {

	public static void main(String[] args) {
		String s = "(((%%Wel¤come%%))) %to% %%core%% %%java%%" ;
		System.out.println(elaborator(s));
	}
	
	public static String elaborator (String s) {
		
		String word = "" ;
		
		for(int i=0 ; i<s.length() ; i++) {
			
			if(Character.isAlphabetic(s.charAt(i))  ||  s.charAt(i)== ' ' ) {
				word = word + s.charAt(i) ;
			}
			
		}
		return word ;
	}

}
