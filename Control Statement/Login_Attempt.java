package com.java;
import java.util.Scanner;

public class Login_Attempt {
	
	String User_Name;
	int User_Password;
	
	String Input_Name;
	int Input_Password;
	
	Scanner sc = new Scanner(System.in);
	
	Login_Attempt(String name,int password){
		User_Name = name;
		User_Password = password;
	}
	
	void login() {

		int i = 3;
		int j = 1;
		
		while(i >= j) {
			
			System.out.println("Enter the Name : ");
			Input_Name = sc.next();
			System.out.println("Enter the Password : ");
			Input_Password = sc.nextInt();
			
			if(User_Name.equals(Input_Name) && User_Password == Input_Password) {
				System.out.println("Login Successful!");
				break;
			}else {
				System.out.println("Enter the correct Password Or Name! and try Again");
			}
			j++;
		}
	}
	

	public static void main(String[] args) {
		
		Login_Attempt obj = new Login_Attempt("Jana",2525);
		obj.login();

	}

}
