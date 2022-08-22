package day31_Array_List;

import java.util.ArrayList;

public class Shopping_list {

	public static void main(String[] args) {
		
		ArrayList <String> shoppingList = new ArrayList<>() ;
		
		shoppingList.add("paper towel") ;
		shoppingList.add("dish soap") ;
		shoppingList.add("beverage") ;
		shoppingList.add("vegetables") ;
		shoppingList.add("fruit") ;
		shoppingList.add("shovel") ;
		
		int count = shoppingList.size();
		System.out.println(count);
		
		System.out.println(shoppingList.toString());
		
System.out.println("first item " + shoppingList.get(0) + " last item " + shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("fruit") ;
		shoppingList.remove(0) ;
		System.out.println(shoppingList.toString());


	}

}
