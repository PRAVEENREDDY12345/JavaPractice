package com.pavanclasses.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "abbas");
		m.put(2, "naresh");
		m.put(3, "praveen");
		m.put(4, "Anil");
		
		System.out.println(m);

		Map<Integer,String> m1 = new LinkedHashMap<>();
		m1.put(1, "abbas");
		m1.put(2, "naresh");
		m1.put(3, "praveen");
		m1.put(4, "Anil");
		
		System.out.println(m1);
		
		
		Map<Integer,String> m11 = new TreeMap<>();
		m11.put(1, "abbas");
		m11.put(2, "naresh");
		m11.put(3, "praveen");
		m11.put(4, "Anil");
		
		System.out.println(m11);
		
		
		String s = m.get(1);
		System.out.println(s);
		
		System.out.println(m.remove(1));
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		m.clear();
		System.out.println(m);
		System.out.println(m.isEmpty());
		
		if(m1.containsKey(1)) {
			
			System.out.println("KeyExist");
			
		}if (m1.containsValue("praveen")) {
			
			System.out.println("Value is exist");
		}else {
			System.out.println("Value is not exist");
		}
		Collection <String> value = m11.values();
		
		System.out.println(value);
		
		Set<Map.Entry <Integer, String>> entry = m1.entrySet();
		

	}

}
