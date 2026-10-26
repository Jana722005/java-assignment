package com.java;
import java.util.Scanner;

class account{
	private String name = "jana";
	private int balance = 20000;
	
	void balance_check() {
		System.out.println("Account Holder Name : " + name);
		System.out.println("Account Balance : " + balance);
	}
	
	void withdrawal(int amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance!");
		}else {
			balance -= amount;
		}
	}
}

public class Banking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		account obj = new account();
		
		System.out.println("Enter the amount : ");
		obj.withdrawal(sc.nextInt());
		obj.balance_check();

	}

}
