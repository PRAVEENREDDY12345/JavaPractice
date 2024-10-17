package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l = new ArrayList<>();

l.add("Deepu");
l.add("Summy");
l.add("Sathayamma");

System.out.println(l);

List <String> removeList = new ArrayList<>();
removeList.add("Deepu");
removeList.add("Summy");

l.removeAll(removeList);
 System.out.println(l);


	
	}}

	
