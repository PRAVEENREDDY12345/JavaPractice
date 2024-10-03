package com.pavanclasses.interfacee;

public class CreditCard implements Payment {

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payement done by credit card of amount : "+amount);
	}

}
