package Assignment_on_OOP_Concepts.Q11;

public class SavingAccounts extends BankAccount{
		
		double interestRate;
		
		public double getInterestRate() {
			return interestRate;
		}
		
		public SavingAccounts(double value) {
			interestRate=value;
		}
		
}
