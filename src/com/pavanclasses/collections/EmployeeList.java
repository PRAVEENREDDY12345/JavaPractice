package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Employee> e = new ArrayList<>();

Employee e1 = new Employee(1, "Praveen", 59730);
Employee e2 = new Employee(2, "Pavan", 130000);
Employee e3 = new Employee(3, "Vyshnavi", 27000);
e.add(e1);
e.add(e2);
e.add(e3);
System.out.println(e);


	}

}
