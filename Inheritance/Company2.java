package user.java;

class Employee{
	String name;
	double salary;
	String language;
}

class Developer extends Employee{
	
	void display(String name, double salary, String language) {
		this.name = name;
		this.salary = salary;
		this.language = language;
		System.out.println("Name of the Employee : " + name + "Salary : " + salary + "Programming Language : " + language);
	}
}

class Tester extends Developer{
	
	void display(String name, double salary, String language) {
		this.name = name;
		this.salary = salary;
		this.language = language;
		System.out.println("Name of the Employee : " + name + "Salary : " + salary + "Programming Language : " + language);
	}
}

public class Company2 {

	public static void main(String[] args) {
		
		Tester obj1 = new Tester();
		Developer obj2 = new Developer();
		
		obj1.display("jana",25000,"Java");
		obj2.display("manooj",30000,"Python");

	}

}