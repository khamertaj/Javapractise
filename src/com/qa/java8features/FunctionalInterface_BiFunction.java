package com.qa.java8features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface_BiFunction {

	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer, String> function = (Integer i, Integer j) -> {
			//return " i + j = " + ( i * j );
			int square1 = i * i;
			int square2 = j * j;
			int result = square1 + square2;
			return "The results is " + result;
		};
		
		String num = function.apply(4, 5);
		System.out.println("Multiple of two numbers: " + num);
		
		BiFunction<String, String, Integer> function1 =  (x, y) -> 
		{
			int l1 = x.length();
			int l2 = y.length();
			int len = l1 +l2;
			 
			return len;
		};
		int lenOfTwoStrings = function1.apply("khamer",("taj"));
		System.out.println("Length of two Strings: " + lenOfTwoStrings);

	}

}
 