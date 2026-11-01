package com.java;

import java.util.Scanner;

public class Smallest_Number {
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int [] arr = new int[size];
	
	Smallest_Number(){
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	void check() {
		
		int Smallest = arr[0];
		
		for(int i=0;i<size;i++) {
			if(arr[i] < Smallest) {
				Smallest = arr[i];
			}
		}
		
		System.out.println("Largest Value : " + Smallest);
		
	}

	public static void main(String[] args) {
		
		Smallest_Number obj = new Smallest_Number();
		obj.check();

	}

}
