package com.pavanclasses.list.iterator;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Vyshnavi");
		m.put(2, "Praveen");
		m.put(3, "Lakshmi");
		System.out.println(m);

		// Using keySet and Iterator.
		Set<Integer> set = m.keySet();
		Iterator<Integer> iterator = set.iterator();

		for (Integer key : set) {

			String value = m.get(key);

			System.out.println(key + "  ==> " + value);
		}
		System.out.println("////////////////////////////////");

		Set<Map.Entry<Integer, String>> ent = m.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator1 = ent.iterator();

		while (iterator1.hasNext()) {

			Map.Entry<Integer, String> entry = iterator1.next();

			System.out.println(entry.getKey() + "   ==> " + entry.getValue());
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		for (Map.Entry<Integer, String> entry : m.entrySet()) {

			System.out.println(entry.getKey() + "===> " + entry.getValue());

		}

		Iterator<Integer> iterator2 = m.keySet().iterator();
		while (iterator2.hasNext()) {
			Integer key = iterator2.next();

			System.out.println(key);

		}
	}

}
