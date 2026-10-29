package user.java;

abstract class paymentMethod{
	abstract void processPayment();
}

class Upi extends paymentMethod{
	
	void processPayment() {
		System.out.println("Payment Process In UPI");
	}
}

class CreditCard extends Upi{
	
	void processPayment() {
		System.out.println("Payment Process In CreditCard");
	}
}

public class Payment {

	public static void main(String[] args) {
			
		CreditCard obj1 = new CreditCard();
		
		Upi obj2 = new Upi();
		
		obj1.processPayment();
		obj2.processPayment();

	}

}
