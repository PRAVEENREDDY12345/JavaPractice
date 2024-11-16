/**
 * 
 */
package com.pavanclasses.interfacee;

/**
 * 
 */
public class GooglePay implements Payment {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payemnt done by Google pay with amount of : "+amount);
	}

}
