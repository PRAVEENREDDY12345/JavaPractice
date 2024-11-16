package com.pavanclasses.list.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
l.add("Praveen");
l.add("Abbas");
l.add("Naresh");


System.out.println(l);

System.out.println("******/////////////***********");
ListIterator<String> iterator = l.listIterator();

while(iterator.hasNext()) {
	
	String element = iterator.next();
	if (element.equals("Praveen")) {
		
		iterator.add("Suresh");
	}if (element.equalsIgnoreCase("Abbas")) {
		
		iterator.add("ABC");
	}
	System.out.println(l);
	if(element.equalsIgnoreCase("Abbas")) {
		
		iterator.set("RAC");
		
	}
	System.out.println(l);
	if (element.equalsIgnoreCase("Praveen"))
		iterator.remove();
	
}
System.out.println(l);
	}

}
