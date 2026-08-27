package practicePrograms;

import java.util.Scanner;

public class Bank {

	double Balance = 10000.0;
	static double Balance1 = 10000.0;

	String Accounttype1 = "Savings";
	String Accounttype2 = "Current";

	public static void main(String[] args) {
		System.out.println("Bank Open Now!!");
		Bank B = new Bank();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter OtherBalance: ");
		Double Other =  sc.nextDouble();
		B.compareBalances(Other);
		
		System.out.println("Enter Account Type: ");
		String type = sc.next();
		B.accountType(type);

		System.out.println("Enter AccountHolder Name: ");

		String Name = sc.next();
		B.AccountHolder(Name);
		B.displayBalance();

		System.out.println("Enter the Deposite Amount: ");
		Double Amount = sc.nextDouble();

		B.depositeAmount(Amount);

		System.out.println("Enter the Withdraw Amount: ");
		Double Amount1 = sc.nextDouble();
		B.withdrawAmount(Amount1);
		// B.displayBalance();
		B.checkBalance(500000.0);
		System.out.println("Enter the Transfer Amount: ");
		Double Amount2 = sc.nextDouble();
		transferAmount(Amount2);

		System.out.println("Enter the Loan: ");
		Double Loan = sc.nextDouble();
		B.checkLoanEligibility(Loan);

		// saticTotalAmount(Amount2);
	}

	void depositeAmount(Double Amount) {
		Balance = Balance + Amount;
		System.out.println("Deposite Amount: " + Amount);
		System.out.println("Total Balance: " + Balance);
	}

	void withdrawAmount(Double Amount) {
		Balance = Balance - Amount;
		System.out.println("Withdraw Amount: " + Amount);
		System.out.println("Total Balance: " + Balance);
	}

	void displayBalance() {
		System.out.println("Total Balance: " + Balance);

	}

	private void checkBalance(Double balance) {
		// balance = balance + Balance;
		System.out.println("Your Balance Is: " + balance);
	}

	static void transferAmount(Double Amount1) {
		// Balance1 = Balance1-Amount1;
		System.out.println("Transfer Amount is : " + Amount1);
		saticTotalAmount(Amount1);
	}

	static void saticTotalAmount(Double Amount2) {
		Balance1 = Balance1 - Amount2;
		System.out.println("Static TotalAmount Is: " + Balance1);
	}

	void AccountHolder(String Name) {
		System.out.println("AccountHolder : " + Name);
	}

	void checkLoanEligibility(Double Loan) {
		if (Loan <= Balance) {
			System.out.println("Loan Will Approve!!");
		} else {
			System.out.println("Loan is rejected");
		}
	}

	void accountType(String type) {
		if (type == Accounttype1) {

			System.out.println("Savings Account!!");
		} else if (type == Accounttype2) {

			System.out.println("Current Account!!");

		} else {
			System.out.println("Invalid Account Type.");
		}
	}

	void compareBalances(Double otherBalance) {

		if (Balance > otherBalance) {
			System.out.println("Your Balance is Higher.");
		} else if (Balance < otherBalance) {
			System.out.println("Other Balance is Higher.");
		} else if (Balance == otherBalance) {
			System.out.println("Both Balance are Equal.");
		}
	}
}
