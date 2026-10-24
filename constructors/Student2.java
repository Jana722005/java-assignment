package com.java;

public class Student2 {
	
	double student_ID;
	String student_Name;
	String course;
	
	void display() {
		System.out.println("Student ID : " + student_ID);
		System.out.println("Student Name : " + student_Name);
		System.out.println("Course : " + course);
	}

	public static void main(String[] args) {
		
		Student2 obj = new Student2();
		obj.display();

	}

}
