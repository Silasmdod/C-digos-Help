package app;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.savesAccount;

public class Programm {
	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new savesAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new savesAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
			
		}
		
		System.out.printf("Total balance %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
			
		}
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
			
		}
		
		/*	
		//UPCASTING
		
		
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new savesAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
		}
		if(acc3 instanceof savesAccount ) {
			savesAccount acc5 = (savesAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
			
		}
		
		
	}*/

}}
