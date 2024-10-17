package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l = new ArrayList<>();
l.add("Naresh");
l.add("Abbas");
l.add("anil");

System.out.println(l);
System.out.println(l.remove(2));
System.out.println(l.remove("Naresh"));
System.out.println(l);
l.add(0,"Naresh");
System.out.println(l);


	}

}
