package com.qa.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalInterface_UnaryOperator {

	public static void main(String[] args) {

		UnaryOperator<Integer> func = (x) -> {
			return x * 3;
		};
		int num = func.apply(5);
		System.out.println("num * 3 = " + num);
		
		Function<Integer, Integer> func1 = (y) -> {
			return y * y ;	
		};
		int doubleit = func1.apply(6);
		System.out.println("doubleit: " +  doubleit);

		
		// Example using Unary Operator
		
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Ruby");
		languages.add("JavaScript");
		
		System.out.println("languages: " + languages);
		languages.replaceAll( val -> val + "khamer");
		System.out.println("languages: " + languages);
		
		
		
	}

}
