package com.pavanclasses.interfacee;

public class OnlinePayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment creditcard = new CreditCard();
creditcard.processPayment(1000);
Payment googlePay = new GooglePay();
googlePay.processPayment(100099);
Payment onlineBanking = new OnlineBaking();
onlineBanking.processPayment(99999);

	}

}
