package com.java;
import java.util.Scanner;

class BankAccount{
	
	double account_number;
	String account_holder;
	double account_balance;
	
	void display(String account_holder,double account_number, double account_balance) {
		this.account_holder = account_holder;
		this.account_number = account_number;
		this.account_balance = account_balance;
	}
}

class SavingAccount extends BankAccount{
	
	Scanner sc = new Scanner(System.in);
	
	void check() {
		System.out.print("Enter the Account Number : ");
		double number = sc.nextDouble();
		
		if(account_number == number) {
			System.out.println("Account Holder : " + account_holder + "\n" + "Account Balance : " + account_balance);
		}else {
			System.out.println("Enter the Valid Account Number!");
		}
	}
}

class PremiumSavingsAccount extends SavingAccount{
	
	int tax = 500;
	void deposit() {
		System.out.print("Enter the Amount : ");
		double amount = sc.nextDouble();
		account_balance += amount + tax;
		System.out.println("Account Balance : " + account_balance + "\n" + "Tax Added");
	}
}

public class Banking {

	public static void main(String[] args) {
		
		BankAccount obj1 = new BankAccount();
		PremiumSavingsAccount obj2 = new PremiumSavingsAccount();
		SavingAccount obj3 = new SavingAccount();
		
		obj1.display("jana",1011,20000);
		obj3.check();
		obj2.deposit();
	}

}
