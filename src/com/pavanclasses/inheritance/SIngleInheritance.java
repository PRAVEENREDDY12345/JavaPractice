package com.pavanclasses.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee(1,"Praveen", 7.63);
e.m1();
System.out.println(e.id+ ", ");
SoftwareEngineer se = new SoftwareEngineer(2,"Naresh",3.5);
se.m2();

MechanicalEngineer me = new MechanicalEngineer(3, "Abbas", 4.1);
me.m3();
	}

}
