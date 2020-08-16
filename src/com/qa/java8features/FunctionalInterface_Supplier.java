package com.qa.java8features;

import java.util.function.Supplier;

public class FunctionalInterface_Supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Takes no argument and no result 

		getText( () -> "Khamer Taj");
		getText( () -> "Rayan Hutha");
		getText( () -> "Hutha");
	}
	
	/*
	 * public static void getText(Supplier<String> text) {
	 * System.out.println(text.get()); }
	 */

	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}

}
