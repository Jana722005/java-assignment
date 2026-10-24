package com.java;

public class ElectricityBill2 {
	
	double units;
	double totalamount;
	double finalbill;
	
	 double calculateBill(double units){
		 this.units = units;
		 if(units <= 100) {
			 totalamount = units * 2;
		 }else if(units <= 200) {
			 totalamount = (100 * 2) + ((units - 100) * 3);
		 }else {
			 totalamount = (100 * 2) + (100 * 3) + ((units - 200) * 5);
		 }
		 
		 return totalamount;
	 }
	 
	 double addFixedCharge() {
		 finalbill = totalamount + 50;
		 return finalbill;
	 }
	 
	 void display() {
		 System.out.println("Total Units : " + units);
		 System.out.println("Energy Charge : " + totalamount);
		 System.out.println("Fixed Bill : 50" );
		 System.out.println("Finalbill : " + finalbill);
	 }

	public static void main(String[] args) {
		
		ElectricityBill2 obj = new ElectricityBill2();
		obj.calculateBill(250);
		obj.addFixedCharge();
		obj.display();

	}

}
