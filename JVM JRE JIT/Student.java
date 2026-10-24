package com.java;

public class Student {

	int studentID;
    String Name;
    int Marks;
    Student(int a, String b, int c){
        studentID = a;
        Name = b;
        Marks = c;
    }

    String display(){
        return "StudentID : " + studentID + "\n" + "Name : " + Name + "\n" + "Marks : " + Marks;
    }

	public static void main(String[] args) {
		
		 Student obj = new Student(55876,"janarthanan",68);
	     System.out.println(obj.display());

	}

}
