package poo;

public class Account {

	private String name;
	private int numberAccount;
	private double balance;
	
	public Account(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumberAccount() {
		return numberAccount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double wdMoney (double whitdraw) {
		
		return balance -= whitdraw + 5.00;
	}
	
	public double dpMoney (double deposit) {
		return balance += deposit;
	}
	
	public String toString() {
		return "\nAccount Data "
				+ "\nAccount "
				+ numberAccount
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ balance;
	}
	
}
