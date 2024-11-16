package com.pavanclasses.abstraction;

public abstract class Vehicle {
int wheels;
String engineType;
public  Vehicle(int wheels, String engineType) {
	super();
	this.wheels = wheels;
	this.engineType = engineType;
}
public void displayDetails() {
	
	System.out.println("Vehicle has" + wheels+ "Wheels and "+engineType+ " engine");
}

abstract void  start();










}
