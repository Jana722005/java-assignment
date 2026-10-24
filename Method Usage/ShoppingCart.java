package com.java;

public class ShoppingCart {
	
	double product1;
	double product2;
	double product3;
	double total;
	String membership;
	double discountamount;
	double finalamount;
	
	double calculateTotal(double p1, double p2, double p3){
		product1 = p1;
		product2 = p2;
		product3 = p3;
		total = product1 + product2 + product3;
		return total;
	}
	
	double calculateDiscount(String type){
		membership = type;
		
		if(membership == "Gold") {
			discountamount = total*20/100;
		}
		else if(membership == "Silver") {
			discountamount = total*10/100;
		}
		else if(membership == "Regular") {
			discountamount = total*5/100;
		}
		else {
			System.out.println("Enter valid membership Type!");
		}
		
		return discountamount;
	}
	
	double calculateFinalAmount(){
		finalamount = total - discountamount;
		return finalamount;
	}

	void display() {
		System.out.println("Total Amount : " + total);
		System.out.println("Discount Price : " + discountamount);
		System.out.println("Finalamount : " + finalamount);
	} 
	
	public static void main(String[] args) {
		
		ShoppingCart obj = new ShoppingCart();
		obj.calculateTotal(2000,1500,500);
		obj.calculateDiscount("Gold");
		obj.calculateFinalAmount();
		obj.display();
	}

}
