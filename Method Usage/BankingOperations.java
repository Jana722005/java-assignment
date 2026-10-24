package com.java;

public class BankingOperations {
	
	double current_balance;
	double deposit;
	double withdrawal_amount;
	double initial_balance = 5000;
	
	double deposit(double deposit) {
		current_balance = initial_balance;
		this.deposit = deposit;
		current_balance += deposit;
		
		return deposit;
	}
	
	double withdraw(double withdraw) {
		withdrawal_amount = withdraw;
		if(withdraw > current_balance) {
			System.out.println("Enter the Sufficient fund!");
		}else {
			current_balance -= withdrawal_amount;
		}
		
		return withdrawal_amount;
		
	}
	
	void checkBalance() {
		System.out.println("Current Balance : " + current_balance);
	}
	
	void displayTransactionSummary(){
		System.out.println("Initial Balance : " + initial_balance);
		System.out.println("Deposited : " + deposit);
		System.out.println("Withdrawn : " + withdrawal_amount);
	}

	public static void main(String[] args) {
		
		BankingOperations obj = new BankingOperations();
		obj.deposit(2000);
		obj.withdraw(1500);
		obj.displayTransactionSummary();
		obj.checkBalance();

	}

}
