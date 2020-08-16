package com.qa.java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(1,2,4,5,6);
		
		values.forEach(System.out::println); // Passing the method as the parameter
		//call by method
		
		
		

	}

}
