package com.java;

class employee{
	double claculate_salary(double a) {
		return a * 0.5;
	}
}

class manager extends employee{
	double claculate_salary(double a) {
		return a * 0.10;
	}
}

class developer extends manager{
	double claculate_salary(double a) {
		return a * 0.20;
	}
}

public class Calculator {
	
	int add(int a, int b){
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		Calculator obj1 = new Calculator();
		
		System.out.println(obj1.add(10, 20));
		System.out.println(obj1.add(21.2,65.2));
		
		developer obj2 = new developer();
		manager obj3 = new manager();
		
		System.out.println("Developer : " + obj2.claculate_salary(20000));
		System.out.println("Manager : " + obj3.claculate_salary(20000));
		

	}

}
