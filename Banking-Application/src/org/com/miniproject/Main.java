package org.com.miniproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("-------Welcome to Bank System Application--------");
	
		 System.out.println("Enter Account Number:");
	       String number=sc.next();
	       System.out.println("Enter name:");
	       String name=sc.next();
	       System.out.println("Enter Email id:");
	       String email=sc.next();
	       System.out.println("Enter Phone Number:");
	       String phn_num=sc.next();
	       System.out.println("The balance is:");
	       double balance=0.0;
	       
	       Account myAccount=new Account(number, balance, name, email, phn_num);
	       System.out.println(myAccount);
	      	       
		do {
	
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.exit");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		
		
		case 1 :   myAccount.CheckBalance();
		          break;
		case 2: 
				System.out.println("Enter the amount to Deposit:");
			    double DepositedMoney=sc.nextDouble();
			    
			    myAccount.DepositMoney(DepositedMoney);
		        break;
		case 3: 
			    System.out.println("Enter the amount to Withdraw:");
		        double WithdrawalMoney=sc.nextDouble();
				myAccount.WithdrawMoney(WithdrawalMoney);
				break;
		case 4:    
			       break;
		
		}
		}while(choice!=4);
		System.out.println("..................Thank you for visiting our Bank.................................");
		
		

	}

}
