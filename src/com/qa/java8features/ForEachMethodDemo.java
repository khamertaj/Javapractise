package com.qa.java8features;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(4,5,6,7,88);
		System.out.println("using forEach method-------------");
		values.forEach( value -> System.out.println(value));
		
		System.out.println("using old way using index number-------------");
			for(int i=0; i<values.size();i++) {
				System.out.println(values.get(i));
			}
			
	    System.out.println("using enhanced for loop using index number-------------");
			
	    for (Integer val : values) {
	    	System.out.println(val);
	    }
	}

}
