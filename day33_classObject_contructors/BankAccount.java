package day33_classObject_contructors;

public class BankAccount {

	double balance ;
	
	public BankAccount() { //this cons. sets the starting balance to 0.0
		balance = 0.0;
	}
	
	public BankAccount (double startBalance) { //this cons. sets the starting balance to the value passes as an argument
		balance = startBalance ;
	}
	
	public BankAccount (String str) { // I convert the string to double
		balance = Double.parseDouble(str) ;
	}
	
	public void deposit (String str) {
		balance = balance + Double.parseDouble(str) ;
	}
	
	public double getBalance() {
		return balance ;
	}
	
	
	
	
	
	
	
	
}
