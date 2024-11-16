package com.pavanclasses.exceptions;

public class BankAccount {
	
	
	private double balance ;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	public void withdraw( double amount) throws InsufficientBalanceException {
		
		if (amount > balance) {
			
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		balance = balance - amount;
		System.out.println("With draw success balance amount is " + balance);
		
	}

}
