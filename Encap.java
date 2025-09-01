package programs;

class Banks
{
	private String name;
	private double balance;
public Banks(String name,double balance)
{
	this.name=name;
	this.balance=balance;
}
public String getname() {
	return name;
	
}
public double getbalance() {
	return balance;
}
public void deposit(double amount) {
	if(amount>0)
	{
		this.balance=balance+amount;
		System.out.println("the updated balance"+balance);
		
	}
	else
	{
		System.out.println("invalid as there is no sufficient amount to be deposited");
	}
	
}
public void withdraw(double amount) {
	if(balance>=amount)
	{
		this.balance=balance-amount;
		System.out.println("balance after withdrawl"+balance);
		
	}
	else
	{
		System.out.println("no sufficient money");
	}
}
}
public class Encap {
	public static void main(String[] args) {
      Banks a1=new Banks("vaishnavi",900);
      	System.out.println("account holder name is"+a1.getname());
      	System.out.println("the balance is"+ a1.getbalance());
      	a1.deposit(200);
      	a1.withdraw(100);
      	     
		
	}
}
