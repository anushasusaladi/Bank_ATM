package org.jsp.bank_atm;
import java.util.Scanner;
public class Bank_Driver {
	public static void main(String [] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter bank name to open account");
		String bname=s.next();
		System.out.println("Enter address of bank");
		String loc=s.next();
		System.out.println("Enter bank ifsc_code");
		String ifcs=s.next();
		Bank b =new Bank(bname,loc,ifcs);
		
		boolean option =true;
		while(option)
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1. for create account");
			System.out.println("Enter 2.for check detials");
			System.out.println("Enter 3.for deposite money");
			System.out.println("Enter 4.for withdraw money");
			System.out.println("Enter 5. for delete account");
			System.out.println("Enter 6.for exit & close");
			
			
			int choice =s.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter name");
				String name=s.next();
				System.out.println("Enter dob");
				String dob=s.next();
				System.out.println("Enter pin");
				String pin=s.next();
				System.out.println("Enter money to deposite");
				double money=s.nextDouble();
				System.out.println("Enter account number of your choice");
				long ano=s.nextLong();
				b.createAccount(new Account(name,dob,pin,money,ano));
				System.out.println("========================================");
				
			}
			break;
			case 2:{
				b.bankDetails();
				System.out.println("=======================================");
			}
			break;
			case 3:{
				System.out.println("Enter account number to deposite money");
				long ano11=s.nextLong();
				System.out.println("Enter how much you want to deposite");
				double money1=s.nextDouble();
				b.Deposite(ano11, money1);
				System.out.println("========================================");
			}
			break;
			case 4:{
				System.out.println("Enter account number to withdraw money");
				long ano1=s.nextLong();
				System.out.println("Enter how much you want to withdraw");
				double money1=s.nextDouble();
				b.Withdraw(ano1, money1);
				System.out.println("======================================");
				
			}
			break;
			case 5:{
				b.DeleteAccount();
			}
			break;
			case 6:{
				System.out.println("Thank you for using...."+bname);
				System.out.println("Having good day....");
				option=false;
			}
			break;
			default:{
				System.out.println("Enter your valid choice");
				break;
			}
			
	
		}
	}

	}
	
}
