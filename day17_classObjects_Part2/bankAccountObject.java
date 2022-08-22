package day17_classObjects_Part2;

public class bankAccountObject {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount () ; //Customer1 is a reference variable
		
		customer1.accountHolder = "Mike Smith" ;
		customer1.accountNumber = 12345 ;
		customer1.balance = 500 ;
		
		customer1.deposit(30);
		customer1.withdraw(150);
		customer1.charge(78, "ruoka");
		

	}

}
