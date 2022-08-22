package Grocery;

import java.util.Scanner;

public class GroceryListMain {
	static GroceryList groceryList = new GroceryList() ; //I want to use these in all class not only main method.
	static Scanner scanner = new Scanner(System.in); 	// Because of that I wrote out of main class and I add static

	public static void main(String[] args) {
		
		boolean quit=false;
		int choice = 0 ;
		printInstructions();
		
		
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt() ; 
			scanner.nextLine(); // I added because if after nextInt , nextLine comes. It will give me error
			
			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printgroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchItem();
					break;
				case 6:
					quit=true ;
					break;

			}
		}	
	}
	
	public static void printInstructions () {
		
		System.out.println("\nPress"); //
		System.out.println("\t 0 - To print choice options."); // tab bosluk var
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
	}
 
	
	public static void searchItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		
		if (groceryList.findItem(searchItem) != null) { //if it can not be found in grocery list , it returns null. Because of that we did
			System.out.println("Found " + searchItem + " in your grocery list");
		}else {
			System.out.println(searchItem + " is not in the grocery list");
		}
	}


	public static void removeItem() {
		System.out.println("Enter item number: ");
		int itemNo= scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1) ;
	}


	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo= scanner.nextInt();   // there is nextInt - nextLine bug
		scanner.nextLine(); //so because of that I added this line
		System.out.println("Enter replacement item: "); 
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem); //item no-1 because in array list index number starts from 0
	}

	
	public static void addItem() {	
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	

}
