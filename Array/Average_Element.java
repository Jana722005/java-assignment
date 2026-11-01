package com.java;
import java.util.Scanner;

public class Average_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size : ");
		
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter the Elements : ");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int sum = 0;
		
		for(int i=0;i<size;i++) {
			sum += arr[i];
		}
		
		int avg = sum/size;
		
		System.out.println("Sum Of Array : " + sum);
		System.out.println("Average Of Array : " + avg);
		sc.close();
	}
	


}
