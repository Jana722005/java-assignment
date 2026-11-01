package com.java;
import java.util.Scanner;

public class ATM {
	
	String Account_holder;
	double Account_Balance;
	int Account_PIN;
	
	int input_pin;
	double input_amount;
	
	ATM(String name,double balance, int pin){
		Account_holder = name;
		Account_Balance = balance;
		Account_PIN = pin;
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	void widthdrawal() {
		System.out.print("Enter the PIN : ");
		input_pin = sc.nextInt();
		
		if(input_pin == Account_PIN) {
			System.out.println("Enter the Widthdraw Amount : ");
			input_amount = sc.nextDouble();
			
			if(input_amount > Account_Balance) {
				System.out.println("Enter the Sufficient Amount to Widthdraw!");
			}else {
				Account_Balance -= input_amount;
				System.out.println("Account Holder Name : "+ Account_holder + "\n" + "Account Balance : " + Account_Balance);
			}
		}else {
			System.out.println("Enter the Correct PIN");
		}
	}

	public static void main(String[] args) {
		
		ATM obj = new ATM("Jana",20000,2525);
		
		obj.widthdrawal();

	}

}
