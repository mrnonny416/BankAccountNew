
public class BankAccount {
	// Propertys
	String customerName;
	int accountNumber;
	String Transaction;
	double interestRate, balance;

	// Constructor
	public BankAccount() {
	}

	public BankAccount(String customerName, int accountNumber, double balance, String Transaction) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.Transaction = Transaction;
	}

	// Method
	double showBalance() {
		return balance;
	}// End ShowBalance

	String withdraw(double balance) {
		if (this.balance >= balance) {
			this.balance -= balance;
			Transaction += "D";
			return "SuccessFul!!";
		} else {
			return "False!!";
		}
	}// End Withdraw

	void addInterest() {

	}// End Deposit
}// End Class
