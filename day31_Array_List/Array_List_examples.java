package day31_Array_List;

import java.util.ArrayList;

public class Array_List_examples {

	public static void main(String[] args) {
		
		//languages
		ArrayList <String> languages = new ArrayList<> () ;
		
		languages.add("english") ;
		languages.add("spanish") ;
		languages.add("finnish") ;
		 
		System.out.println(languages.size()); //3
		System.out.println(languages.toString());
		
		languages.add("russian") ;
		System.out.println(languages.toString());
		languages.remove(0) ;
		System.out.println(languages.toString());
		
		

		
		
	}

}
