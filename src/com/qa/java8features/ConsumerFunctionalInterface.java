package com.qa.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("ammi", "khamer","sam","rayan","raheel","raqeeb");
		
		
		  Consumer<String> consumberObj = new Consumer<String>() {
		  
		  public void accept(String s) { System.out.println(s); } };
		 
		
		names.forEach(name -> System.out.println(name));
		
		

	}

}
