package com.java;

import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size : ");
		
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int Positive_Count = 0;
		int Negative_Count = 0;
		
		for(int i=0;i<size;i++) {
			if(arr[i]>=0) {
				Positive_Count++;
			}else if(arr[i] < 05){
				Negative_Count++;
			}
		}
		
		System.out.println("Positive Count : " + Positive_Count + "\n" + "Negative Count : " + Negative_Count);


	}

}
