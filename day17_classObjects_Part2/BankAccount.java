package day17_classObjects_Part2;

public class BankAccount {
	double balance ;
	String accountHolder ;
	int accountNumber ;
	
	public void deposit (double amount)  {
		System.out.println("depositing... " + amount + " to " + accountNumber);
		balance += amount ; // balance = balance + amount
		System.out.println("new balance is " + balance);
	}
	
	public void withdraw (double amount) {
		System.out.println("withdrwing... "  + amount + " from " + accountNumber);
		balance= balance - amount ;
		System.out.println("new balance is " + balance);
	}
	
	public void charge (double price , String item) {
		if (balance>=price) {
			System.out.println("hyväksy " + "item name is " + item);
			balance = balance - price ;
			System.out.println("new balance is " + balance);
		}else {
			System.out.println("not enough money for " + item);
		}
	}
}

