package com.pavanclasses.interview.questions;

import java.util.HashMap;

public class Count {
	public static void main(String[] args) {
		
		String[] sentence = {"Praveen is going hyd and Praveen is return ban."};
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : sentence[0].split(" ")) {
            wordCountMap.put(word, 1);
            
        }System.out.println("Word frequencies: " + wordCountMap);
    
	}
}