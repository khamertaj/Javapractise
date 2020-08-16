package com.core.javainterviewfaqs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Find the occurences of each character in a string
 * @author USER
 *
 */
public class DuplicateCharsInString {

	public static void main(String[] args) {
		
		String str = "JAVASELENIUMWEBDRIVERTESTNGJUNIT";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char chars[] = str.toCharArray();
		
		int len = chars.length;
		for (int i = 0; i< len ; i++) {
			
			if ( ! map.containsKey(chars[i]) ) {
				map.put(chars[i], 1);
			} else {
				map.put(chars[i], map.get(chars[i]) +  1);
			}
		}
		
		System.out.println("Map::: " +  map);
		
		
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		
		for (Entry<Character, Integer> entry: entryset) {
			
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is : " + entry.getKey() + " ==> " +  entry.getValue());
			}
		}

	}

}
