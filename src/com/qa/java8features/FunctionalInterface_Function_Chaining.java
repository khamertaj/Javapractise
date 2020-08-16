package com.qa.java8features;

import java.util.function.Function;

public class FunctionalInterface_Function_Chaining {

	public static void main(String[] args) {
		
	
	System.out.println("After Lamba expression code------");
	Function<String, Integer> function1= (str) ->  { 
	return str.length(); 
	};
	
	
	int str2Length = function1.apply("khamer");
	System.out.println("len2: " + str2Length);
	
	
	
	System.out.println("Chaining function");
	Function<Integer, Integer> func2 = (number) -> {
		return number*number;
	};
	
	int squareNum = function1.andThen(func2).apply("Rayan hutha");
	System.out.println("Square Number : " +  squareNum);
	
	
	}
	
	}
	



