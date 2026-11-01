package com.java;
import java.util.Scanner;

public class Largest_Number {
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int [] arr = new int[size];
	
	Largest_Number(){
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	void check() {
		
		int largest = arr[0];
		
		for(int i=0;i<size;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("Largest Value : " + largest);
		
	}

	public static void main(String[] args) {
		
		Largest_Number obj = new Largest_Number();
		obj.check();

	}

}
