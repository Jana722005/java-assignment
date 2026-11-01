package com.java;

public class Skip_Multiples {

	public static void main(String[] args) {

		for(int i=1;i <=30; i++) {
			if(i % 3 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}

	}

}
