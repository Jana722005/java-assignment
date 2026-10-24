package com.java;

public class BankAccount {
	
	double accountNumber;
	String holderName;
	double balance;
	
	BankAccount(){
		accountNumber = 1001;
		holderName = "Priya";
		balance = 5000;
	}
	
	void displayAccount(){
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + holderName);
		System.out.println("Available Balance : " + balance);
	}

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount();
		obj.displayAccount();

	}

}
