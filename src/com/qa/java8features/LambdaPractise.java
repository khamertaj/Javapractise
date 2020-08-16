package com.qa.java8features;

public class LambdaPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Webpage page =  (label, value) -> {System.out.println("Headerlabel: " + label + " and HeaderValue: " + value);};
		
		
		page.header("name", "khamer");
		
	}

}
