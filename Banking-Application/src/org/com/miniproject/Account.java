package org.com.miniproject;

public class Account {

	private String number;	
	private String name;
	private String email;
	private String ph_num;
	private double balance;
	
	
	public Account() {
		
	}
	

	public Account(String number, double balance, String name, String email, String ph_num) {
		
		this.number = number;
		this.name = name;
		this.email = email;
		this.ph_num = ph_num;
		this.balance = balance;
	}
	

	public void CheckBalance()
	{
		System.out.println("The total Balance is:  "+this.balance);
	}
	
	public void DepositMoney(double DepositedMoney)
	{
		this.balance+=DepositedMoney;
		System.out.println("Deposit is Successful, new Balance is : "+this.balance);
		
	}
	public void WithdrawMoney(double Withdrawal_Money)
	{
		if(this.balance-Withdrawal_Money<0)
		{
			System.out.println("Withdraw is Unsuccesful"+this.balance+" is left");
		}
		else {
		
		this.balance-=Withdrawal_Money;
		System.out.println("Money is Successfully Withdrawed, The new Balance is: "+this.balance);
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public String getPh_num() {
		return ph_num;
	}
	public void setPh_num(String ph_num) {
		ph_num = ph_num;
	}
	@Override
	public String toString() {
		return "Account [Number=" + number + ", Balance=" + balance + ", Name=" + name + ", Email=" + email
				+ ", Ph_num=" + ph_num + "]";
	}
	
	
}
