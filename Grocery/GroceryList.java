package Grocery;

import java.util.ArrayList;

public class GroceryList {  //in template , when we define method we do not use static
							// because I want to use in another class
	ArrayList<String> groceryList = new ArrayList<>();
	
	public void printgroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i=0 ; i<groceryList.size() ; i++) {
			System.out.println(i+1 + ". "  + groceryList.get(i));
		}
	}

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem) ;
		System.out.println("Grocery item " + (position+1) + " has been modified");
	}

	public void removeGroceryItem(int position) {
		groceryList.remove(position) ;
	}

	public String findItem(String searchItem) {
		
		int position = groceryList.indexOf(searchItem) ;
		if (position>=0) {
			return groceryList.get(position) ;
		}
		return null ;
		
		
	}

}
