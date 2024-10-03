/**
 * 
 */
package com.pavanclasses.abstraction;



/**
 * 
 */
public class Bike extends Vehicle {

	/**
	 * @param wheels
	 * @param engineType
	 */
	public Bike(int wheels, String engineType) {
		super(wheels, engineType);
		// TODO Auto-generated constructor stub
	}
	@Override
	 void start() {
		System.out.println("Bike Starts with Kick Ignition");
		
	}
	
	

}
