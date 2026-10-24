package com.java;

public class Product {
	
	double productId;
	String productName;
	double price;
	
	Product(){
		productId = 301;
	}
	
	Product(double productId,String productName){
		this.productId = productId;
		this.productName = productName;
	}
	
	Product(double productId,String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	void display(){
		System.out.println("Product ID : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
	}

	public static void main(String[] args) {
		
		Product obj1 = new Product();
		Product obj2 = new Product(302,"Laptop");
		Product obj3 = new Product(303,"Mobile",20000);
		
		obj1.display();
		obj2.display();
		obj3.display();

	}

}
