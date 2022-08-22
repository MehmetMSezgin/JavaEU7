package day31_Array_List;

import java.util.ArrayList;

public class contains_method {

	public static void main(String[] args) {
		ArrayList <String> l1 = new ArrayList<>() ;
		
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		l1.add("e");
		
		ArrayList <String> l2 = l1 ; // this is equalisation if you change one of these , other one will change too
		
		//copy all
		ArrayList <String> l3 = new ArrayList<String>(l1) ; //this is just copying
		l3.add("f") ;
		l3.add("g") ;
		
		//contains
		System.out.println(l3.contains("h"));
		
		System.out.println(l1.containsAll(l2)); //contains all or not
		
	}

}
