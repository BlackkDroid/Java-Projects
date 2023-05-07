package com.canara;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		Bank bank=new BankImpl(25000); //upcasting

		while(true) {

			System.out.println("Welcome to Canara Bank \n\n Enter 1 to Deposit \n"
					+ " Enter 2 to Withdraw \n"
					+ " Enter 3 to check Balance \n"
					+ " Enter 4 to Exit the Application");
			int choice=scan.nextInt();


			switch(choice) {

			case 1: System.out.println(" Enter the amount to be deposited "); 

			int amountToDeposit=scan.nextInt();
			bank.deposit(amountToDeposit);
			//bank.deposit(scan.nextInt());

			System.out.println(" Your Balance is  "+bank.getBalance());
			break;

			case 2:
				System.out.println(" Enter the amount to be withdrawn !");
				int amountToWithdraw=scan.nextInt();
				bank.withdraw(amountToWithdraw);
				System.out.println(" Your Balance is "+bank.getBalance());
				break;

			case 3:

				System.out.println(" Available Balance is "+bank.getBalance());
				break;

			case 4:
				System.out.println(" Thank you for trusting Canara Bank");
				System.exit(0);

			default: 
				try {
					throw new InvalidChoiceException("Invalid Choice! Kindly Enter Valid Choice \n ");
				}
				catch(Exception e) {
					System.out.println(" "+e.getMessage());
				}

			}

			System.out.println("------********=======*********--------- \n");

		}

	}
}
