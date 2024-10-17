package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> l = new ArrayList<>();
l.add(0, "Sunny");
l.add(1, "Ammulu");
l.add(2, "Simba");


System.out.println(l);
l.set(2, "Chaswika");
System.out.println(l);
System.out.println(l.size());

l.add(2, "Simba");

System.out.println(l);
System.out.println(l.size());

System.out.println(l.get(0));

System.out.println(l.remove(1));
System.out.println(l);
System.out.println(l.size());

System.out.println(l.indexOf("Bunny"));
System.out.println(l.indexOf("Chaswika"));
l.add("Sunny");
l.add("Chaswika");
System.out.println(l);
System.out.println(l.lastIndexOf("Chaswika"));
System.out.println(l.lastIndexOf("Sunny"));

System.out.println("Middle Name  "+l.get(l.size()/2));
	}

}
