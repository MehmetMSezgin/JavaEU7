package day31_Array_List;

import java.util.ArrayList;

public class Add_all_method {

	public static void main(String[] args) {
		
		ArrayList <String> l1 = new ArrayList <>() ;
		l1.add("java") ;
		l1.add("js") ;
		
		ArrayList <String> l2 = new ArrayList <>() ;
		l2.add("c++") ;
		l2.add("c") ;
		
		l1.addAll(l2) ;
		System.out.println(l1);
		
		
	}

}
