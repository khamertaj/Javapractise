package com.core.javainterviewfaqs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesWordsInString {

	public static void main(String[] args) {
		
		String str = "Hey Java is the best language is Java";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String[] words = str.split(" ");
		
		int len = words.length;
		for (int i = 0; i< len ; i++) {
			
			if ( ! map.containsKey(words[i]) ) {
				map.put(words[i], 1);
			} else {
				map.put(words[i], map.get(words[i]) +  1);
			}
		}
		
		System.out.println("Map::: " +  map);
		
		
		Set<Entry<String, Integer>> entryset = map.entrySet();
		
		for (Entry<String, Integer> entry: entryset) {
			
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is : " + entry.getKey() + " ==> " +  entry.getValue());
			}
		}
					

	}

}
