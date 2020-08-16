package com.core.javainterviewfaqs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String[] languages = {"Java", "Python","Csharp","Java","JavaScript","JavaScript"};
		int len = languages.length;
		
		//WAY1: Compare Each Element -- O (nxn) -- worst solution
		System.out.println("WAY1: Compare Each Element -- O (nxn) -- worst solution");
		for (int i=0; i< len; i++) 
		{
	          for (int j = i+1; j<len; j++) {
	        	  
	        	  if (languages[i] == languages[j]) {
	        		  System.out.println("Duplicate Element ==> " + languages[i] );
	        	  }
          }
		}
		
		
		System.out.println("--------------------------------------------------");
		
		// WAY2: Using Hashset : Java Collection : Its stores only unique elements
		System.out.println("WAY2: Using Hashset : Java Collection : Its stores only unique elements");
		
		
		Set<String> set =  new HashSet<String>();	
		for (String lang: languages) {
			
			if (set.add(lang) ==  false) {
				System.out.println("Duplicate Element ==> " +  lang);
			}
		}
		
		System.out.println("--------------------------------------------------");
		
		// WAY3: using HashMap
		System.out.println("WAY2: using HashMap");
		Map<String, Integer> map = new HashMap<String, Integer> ();
		Integer count = 0;
		
		for (String lang: languages) {
			count = map.get(lang);
			
			if (count == null) {
				map.put(lang, 1);
			}
			else {
				map.put(lang,  count+1);
			}
		}
	    
		// WAY3: using HashMap, Improvised
		System.out.println("--------------------------------------------------");
		Set<Entry<String, Integer>> entryset = map.entrySet();
		
		for (Entry<String, Integer> entry: entryset) {
			
			if (entry.getValue() > 1 ) {
				System.out.println("Duplicate Element::: " +  entry.getKey());
			}
		}
		
		
		String names[]={"Ankur","Hero","Arun","Ankur","Hero"};
		  HashMap<String, Integer> map1 = new HashMap<>();
		  for (String ch : names) {
		   if (map1.containsKey(ch)) {
		    int val = map1.get(ch);
		    map1.put(ch, val + 1);
		   } else {
		    map1.put(ch, 1);
		   }
		  }
		  System.out.println(map);
		  Set<Entry<String, Integer>> entryset1 = map.entrySet();
			
			for (Entry<String, Integer> entry: entryset1) {
				
				if (entry.getValue() > 1 ) {
					System.out.println("Duplicate Element::: " +  entry.getKey());
				}
			}
		
}
}
