package com.qa.java8features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class FunctionalInterface_BinaryOperator {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> func = (x, y) -> 
		{
			return x + y;
		};
		
		int res = func.apply(4, 6);
		System.out.println("res: " + res);
		
		
		BiFunction<Integer, Integer, Integer> func2 = (i,j) -> {
			return i+j;
		};
		
		int res2 = func2.apply(40, 30);
		System.out.println("res2: " +  res2);
		
		

	}

}
