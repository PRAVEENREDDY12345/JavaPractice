package com.pavanclasses.interfacee;

public class OnlineBaking implements Payment {

	public OnlineBaking() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment done by online Banking of amount : "+amount);
	}

}
