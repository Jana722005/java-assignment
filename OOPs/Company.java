package user.java;
import java.util.Scanner;

class employee{
	
	private String name = "Jana";
	
	String getname() {
		return name;
	}
	 
	public void setname(String name) {
		this.name = name;
	}
}

class developer extends employee{
	Scanner sc = new Scanner(System.in);
	void display() {
		System.out.println("Enter Developer Name : ");
		setname(sc.next());
		System.out.println("Name : " + getname() + "\n" + "Role : Develops the Applications!");
	}
}

class manager extends developer{
	void display() {
		System.out.println("Enter Manager Name : ");
		setname(sc.next());
		System.out.println("Name : " + getname() + "\n" + "Role : Manage the Developers!");
	}
}
public class Company {

	public static void main(String[] args) {
		
		manager obj1 = new manager();
		developer obj2 = new developer();
		
		obj1.display();
		obj2.display();

	}

}
