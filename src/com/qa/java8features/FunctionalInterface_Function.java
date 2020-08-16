package com.qa.java8features;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionalInterface_Function {

	public static void main(String[] args) {
		
	Function<String, Integer> func = new Function<String,Integer>() {
		
		public Integer apply(String str) {
			
			return str.length();
		}
	};
	
	int lenOfStr = func.apply("khamer taj");
	
	System.out.println("Length of String is: " + lenOfStr);
		
	System.out.println("After Lamba expression code------");
	Function<String, Integer> function1= (str) ->  { 
	return str.length(); 
	};
	
	
	int str2Length = function1.apply("khamer");
	System.out.println("len2: " + str2Length);
	
	
	
	System.out.println("Square of a number");
	
	Function<Integer, Integer> func2 = (number) -> {
		return number*number;
	};
	
	int squareNum = func2.apply(4);
	System.out.println("Square of number: " +  squareNum);
	
	}
	
	}
	



