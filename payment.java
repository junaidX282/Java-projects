
public interface payment {

	void processPayment();
	
	 void generateReceipt();
}
class CreditCardPayment implements payment{

	@Override
	public void processPayment() {
		System.out.println("Credit card payment processing");
		
	}

	@Override
	public void generateReceipt() {
		System.out.println("Credit card recept processing");
		
	}
	
}
class PayPalPayment implements payment{

	@Override
	public void processPayment() {
		System.out.println("paypal payment processing");
	}

	@Override
	public void generateReceipt() {
		System.out.println("paypal reciept processing");
		
	} 
	
}
class Ab{
	public static void main(String[] args) {
			CreditCardPayment obj = new CreditCardPayment();
			obj.generateReceipt();
			obj.processPayment();
			
			PayPalPayment obj1 = new PayPalPayment();
			obj1.generateReceipt();
			obj1.processPayment();
			
		}
}