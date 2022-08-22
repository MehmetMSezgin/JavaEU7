package day32_arrayList_part2;

import java.util.ArrayList;

public class equalMethod {

	public static void main(String[] args) {
		
		ArrayList<String> friends1 = new ArrayList <>() ;
		ArrayList<String> friends2 = new ArrayList <>() ;
		
		friends1.add("a");
		friends1.add("b");
		friends1.add("c");
		friends1.add("d");
		
		friends2.add("a");
		friends2.add("b");
		friends2.add("c");
		friends2.add("d");
		
		if(friends1.equals(friends2)) {
			System.out.println("same");
		}
		
		System.out.println(friends1==friends2); // it is false because value is same but addresses are different

		

	}

}
