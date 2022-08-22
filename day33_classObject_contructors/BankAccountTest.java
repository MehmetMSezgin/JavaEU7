package day33_classObject_contructors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner (System.in) ;
		
		String input ;
		
		System.out.println("what is your starting balance");
		input = sc.next() ;
		
		BankAccount account = new BankAccount (input) ;
		
		System.out.println("how much were you paid?");
		input = sc.next() ;
		
		account.deposit(input);
		
		System.out.println("your pay has been deposited.your current balance is " + account.getBalance() );
		
		

	}

}
