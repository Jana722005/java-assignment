package com.java;
import java.util.Scanner;

public class Student_Grade {
	
	double Student_mark;
	String Student_name;
	String grade;
	
	Scanner sc = new Scanner(System.in);
	
	void Calculate_Grade() {
		System.out.println("Enter the Student Name : ");
		Student_name = sc.next();
		System.out.println("Enter the Mark : ");
		Student_mark = sc.nextDouble();
		
		sc.close();
		
		if(Student_mark >=90) {
			grade = "A";
		}
		else if(Student_mark < 90 && Student_mark >= 75) {
			grade = "B";
		}
		else if(Student_mark < 75 && Student_mark >=50) {
			grade = "C";
		}
		else {
			grade = "Fail";
		}
		
		System.out.println(grade);
	}

	public static void main(String[] args) {
		
		Student_Grade obj = new Student_Grade();
		obj.Calculate_Grade();

	}

}
