package com.pavanclasses.exceptions;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount bankAccount = new BankAccount(1000);

try {
	bankAccount.withdraw(100);
}catch (InsufficientBalanceException e){
	System.out.println("Caught Exception" +e.getMessage());
}
	}

}
