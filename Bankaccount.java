
public class Bankaccount {

	private int accountNumber;
	private int balance=900;
	private String ownerName="ashi";
	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//	
//	public void setOwnerName(String ownerName) {
//		this.ownerName = ownerName;
//	}
//	public String getOwnerName() {
//		return ownerName;
//	}
	void deposit(int deposit) 
	{
		balance=balance+deposit;
	}
	int withdraw(int withdraw) 
	{
		balance=balance-withdraw;
		return balance;
	}
}
class A {
	public static void main(String[] args) {
		
		Bankaccount obj=new  Bankaccount();
//		obj.setBalance(50000);
//		obj.withdraw(1000);
//		obj.withdraw(1000);
		obj.deposit(9000);
		int c=obj.withdraw(100);
//		
	System.out.println(c);
//		
	
		
	}
	
}