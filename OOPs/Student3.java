package com.java;

public class Student3 {
	
	String name;
	int age;
	
	Student3(String name){
		this.name = name;
	}
	
	Student3(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
	}

	public static void main(String[] args) {
		
		Student3 obj1 = new Student3("jana");
		Student3 obj2 = new Student3("Hari",21);
		
		obj1.display();
		obj2.display();

	}

}
