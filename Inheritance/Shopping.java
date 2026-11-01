package com.java;

class Product{
	String product;
	double price;
	
}

class Electronics extends Product{
	
	void display(String product_name,double price) {
		this.product = product_name;
		this.price = price;
		
		System.out.println("Product Name : " + product);
		System.out.println("Product price : " + price);
	
	}
}

class Clothing extends Product{
	
	void display(String product_name,double price) {
		this.product = product_name;
		this.price = price;
		
		System.out.println("Product Name : " + product);
		System.out.println("Product price : " + price);
	
	}
}

class Books extends Product{
	
	void display(String product_name,double price) {
		this.product = product_name;
		this.price = price;
		
		System.out.println("Product Name : " + product);
		System.out.println("Product price : " + price);
	
	}
}

public class Shopping {

	public static void main(String[] args) {
		
		Electronics obj1 = new Electronics();
		Clothing obj2 = new Clothing();
		Books obj3 = new Books();
		
		obj1.display("Laptop", 50000);
		System.out.println();
		obj2.display("T-Shirt", 599);
		System.out.println();
		obj3.display("Atomic Habits", 1200);

	}

}
