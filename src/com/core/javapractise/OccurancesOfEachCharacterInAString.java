package com.core.javapractise;

import java.util.TreeMap;

public class OccurancesOfEachCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		char[] chrArray = str.toCharArray();
		TreeMap<Character, Integer> map =  new TreeMap<Character, Integer>();
		
		for (char c: chrArray) {
			
			if (! map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
			
		}
		
		System.out.println(map);
		
		/*
		 * forEach(TreeMap<Character, Integer> entry: map.entrySet()) {
		 * 
		 * }
		 */

	}

}
