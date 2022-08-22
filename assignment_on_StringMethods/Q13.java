package assignment_on_StringMethods;

import java.util.Scanner;

public class Q13 {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter first point");
	String start = input.nextLine();
	System.out.println("enter second point");
	String finish = input.nextLine();
	input.close();
	
	routeInstructions(start, finish);
}

public static void routeInstructions(String start, String end) {
	
		String [] arr = {"A","B","C","D","A","B","C","D"};
		String directions="";
		String result="";
		start = start.toUpperCase();
		end = end.toUpperCase();
		
		if(!start.equals(end)) {
			
			for(int i=0; i<8; i++) {
				
				if(arr[i].equals(start)) {
					switch(start) {
					case "A": directions = " right >"; break;
					case "B": directions = " down >"; break;
					case "C": directions = " left >"; break;
					case "D": directions = " up >";
					
					}
					result += directions;
					start = arr[i+1]; // A, +1 = B ---> D
					if(start.equals(end)) {
						System.out.println(result.substring(1,result.length()-2) + ": " + end + " found");
						break;
					}
				}
				
			}
			
		} else {
			System.out.println(start + " found");
		}
		
	}

}