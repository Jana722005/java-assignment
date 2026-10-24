package com.java;

public class StudentRecord {
	
	double rollNumber;
	String studentName;
	double marks;
	
	StudentRecord(double rollNumber,String studentName,double marks){
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	StudentRecord(StudentRecord student){
		this.rollNumber = student.rollNumber;
		this.studentName = student.studentName;
		this.marks = student.marks;
	}
	
	void display() {
		System.out.println("Roll NO : " + rollNumber);
		System.out.println("studentName : " + studentName);
		System.out.println("Marks : " + marks);
	}

	public static void main(String[] args) {
		
		StudentRecord original = new StudentRecord(225,"jana",75);
		StudentRecord copy = new StudentRecord(original);
		
		copy.marks = 90;
		
		System.out.println("original Data : \n");
		original.display();
		System.out.println("copy Data : \n");
		copy.display();

	}

}
