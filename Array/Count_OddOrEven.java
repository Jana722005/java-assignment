package com.java;
import java.util.Scanner;

public class Count_OddOrEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Size : ");
		
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int Odd_Count = 0;
		int Even_Count = 0;
		
		for(int i=0;i<size;i++) {
			if(arr[i] % 2 == 0) {
				Even_Count++;
			}else {
				Odd_Count++;
			}
		}
		
		System.out.println("Odd Count : " + Odd_Count + "\n" + "Even Count : " + Even_Count);

	}

}
