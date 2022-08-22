package replit;

import java.util.Scanner;

public class Split_email_arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the mail");
	    String email = input.nextLine();
	    
	    if (email.contains("@")) {
	    	String[] splitEmail = email.split("@") ;
	    	System.out.println("Email id: " + splitEmail[0]);
	    	System.out.println("Email domain: " + splitEmail[1]);
	    	
	    }else {
	    	System.out.println("invalid email");
	    }

	}

}
