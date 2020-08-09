
public class Main {
	public static void main(String[] args) {
		BankAccount[] account = new BankAccount[10];
		int max = 2, min = 2;
		account[1] = new BankAccount("Mr.A", 111, 1000.0, "DDWDDWWWW");
		account[2] = new BankAccount("Mr.B", 222, 2000.0, "DDDDDW");
		account[3] = new BankAccount("Mr.C", 333, 3000.0, "DDWWWWWW");
		account[4] = new BankAccount("Mr.D", 444, 4000.0, "DWWWDDDDDD");
		account[5] = new BankAccount("Mr.E", 555, 5000.0, "DDDDWWWD");
		for (int i = 1; i <= 5; i++) {
			System.out.print(account[i].customerName + " Withdraw " + account[i].withdraw(100.0));
			System.out.print(account[i].customerName + " In Bank " + account[i].showBalance() + "\n");
		}
		for (int i = 1; i <= 5; i++) {
			if (account[i].balance > account[max].balance) {
				max = i;
			}
			if (account[i].balance < account[min].balance) {
				min = i;
			}
		}
		System.out.print("\nThe person with highest account balance is " + account[max].customerName + " ($"+ account[max].balance + ")\n");
		System.out.print("The person with lowest account balance is " + account[min].customerName + " ($"+ account[min].balance + ")\n\n");
		for (int i = 1; i <= 5; i++) {
			char tempType = ' ', type = ' ';
			int tempCount = 1, count = 1;
			for (int j = 0; j < account[i].Transaction.length(); j++) {
				if (tempType == account[i].Transaction.charAt(j)) {
					tempCount += 1;
					if (tempCount > count) {
						count = tempCount;
						type = tempType;
					}
				} else {
					tempType = account[i].Transaction.charAt(j);
					tempCount = 1;
				}
			}
			if(type == 'D') {
				System.out.println(account[i].customerName + " Longest repeating activity: Deposit ("+count+" times)");
			}else {
				System.out.println(account[i].customerName + " Longest repeating activity: Withdraw ("+count+" times)");
			}
		}
	}
}
