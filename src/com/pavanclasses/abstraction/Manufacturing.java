package com.pavanclasses.abstraction;

public class Manufacturing {

	public Manufacturing() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Vehicle car = new Car(4, "CNG");
	car.displayDetails();
	car.start();
	
	Vehicle bike = new Bike (2, "petrol");
	bike.displayDetails();
	bike.start();
	
		
	
	
	
}
}
