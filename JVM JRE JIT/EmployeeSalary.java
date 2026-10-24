package com.java;

public class EmployeeSalary {
	
	int salary;
	int allowance;
	int deduction;
	int net;
	int gross;
	
	int calculateSalary(int salary, int allowance){
		this.salary = salary;
		this.allowance = allowance;
		gross = salary + allowance;
		return gross;
	}
	
	int calculateNetSalary(int deduction) {
		this.deduction = deduction;
		net = gross - deduction; 
		return net;
	}
	
	void displayDetails(String name) {
		System.out.println("Employee Name : " + name);
		System.out.println("Gross Salary : " + gross);
		System.out.println("Net Salary : " + net);
	}

	public static void main(String[] args) {
		
		EmployeeSalary obj = new EmployeeSalary();
		
		obj.calculateSalary(25000,5000);
		obj.calculateNetSalary(2000);
		obj.displayDetails("jana");
	}

}
