package com.pavanclasses.encapsulation;

public class MainClassEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		
		e.setEmployee_id(56851);
		e.setEmployee_name("Praveen");
		e.setSalery(7.63);
		
		
		System.out.println("Employee_Id is " +e.getEmployee_id());
		System.out.println("Employee_name is " +e.getEmployee_name());
		System.out.println("Salary is " +e.getSalery());
		
	}

}
