package com.java;

public class Employee2 {
	
	double employeeId;
	String employeeName;
	double salary;
	
	Employee2(double employeeId,String employeeName,double salary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		
	}
	
	 void calculateAnnualSalary(){
		 System.out.println("Annual Salary : " + salary * 12);
	 }

	public static void main(String[] args) {
		
		Employee2 obj1 = new Employee2(101, "Arun", 25000);
		Employee2 obj2 = new Employee2(102, "Divya", 35000);
		Employee2 obj3 = new Employee2(103, "Kumar", 40000 );
		
		obj1.calculateAnnualSalary();
		obj2.calculateAnnualSalary();
		obj3.calculateAnnualSalary();

	}

}
