package com.qa.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Implemented Consumer Class
		/*
		 * Consumer<Integer> con = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t);
		 * 
		 * } };
		 * 
		 * values.forEach(con);
		 */
		
		
		values.forEach(val -> System.out.println(val));

	}

}
