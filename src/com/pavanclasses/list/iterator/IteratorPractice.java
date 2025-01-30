package com.pavanclasses.list.iterator;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class IteratorPractice {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();

		map.put("AP", "Amaravathi");
		map.put("AN", "ItaNagar");
		map.put("BR", "Patna");

		JSONObject json = new JSONObject();
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			
			json.put(entry.getKey(),entry.getValue());
			
		}
		

		System.out.println(json);

	}

}
