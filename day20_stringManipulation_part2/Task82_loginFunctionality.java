package day20_stringManipulation_part2;

import java.util.Scanner;

public class Task82_loginFunctionality {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter your username");
		String userName = sc.nextLine() ;
		String userNameData = "Dashinka" ;
		System.out.println("Please enter your password");
		String password = sc.nextLine() ;
		String passwordData = "1998" ;
		
		
		if ((userName.equals("")) && password.equals("")) {  //  !password.equals("") ---> password is not empty
			System.out.println("User name and Password cannot be empty");
			return ;
		}
		
		if (userName.equals("")) {
			System.out.println("User name cannot be empty");
			return ;
		}
		
		if (password.equals("")) {
			System.out.println("Password cannot be blank");
			return ;
		}
		
		if (userName.equals(userNameData) && password.equals(passwordData)) {
			System.out.println("User logged in successfully");
		}else {
			System.out.println("User name or password is not valid");
		}

	}

}
