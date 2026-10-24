package com.java;

public class StudentResult {
	
	int maths;
	int science;
	int history;
	int english;
	int physics;
	int total;
	double avg;
	String grade;
	
	StudentResult(int a,int b,int c,int d,int e){
		maths = a;
		science = b;
		history = c;
		english = d;
		physics = e;
	}
	
	int calculateTotal(){
		total = maths + science + history + english + physics;
		return total;
	}
	
	double calculateAverage() {
		avg = total/5;
		return avg;
	}
	
	String calculateGrade(){
		if(avg >=90) {
			grade = "A";
		}
		else if(avg < 90 && avg >= 75) {
			grade = "B";
		}
		else if(avg < 75 && avg >=50) {
			grade = "C";
		}
		else {
			grade = "Fail";
		}
		
		return grade;
	}
	
	void display() {
		System.out.println("Total Marks : " + total);
		System.out.println("Average Marks : " + avg);
		System.out.println("Grade : " + grade);
	}

	public static void main(String[] args) {
		
		StudentResult obj = new StudentResult(85, 78, 92, 88, 77);
		obj.calculateTotal();
		obj.calculateAverage();
		obj.calculateGrade();
		obj.display();
	}

}
