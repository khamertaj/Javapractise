package com.core.javapractise;

public class StringAllMethodsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # length() - find the length of string
		
		String s1= " Khamer Taj";
		System.out.println("Length of String = >  " + s1.length());
		
		// # equals() -  compare two strings Objects
		
		String s2 = "Khamer";
		String s3 = "rayan";
		System.out.println("Compare two Strings s1 = " + s1 + " and s2 = " + s2  + "==== > " +  s1.equals(s2));

		// #equalsIgnoreCase()
		
		String s4 = "Samsul";
		String s5 = "SAMSUL";
		System.out.println("Compare two Strings s1 = " + s4 + " and s2 = " + s5  + " ==== > " +  s4.equalsIgnoreCase(s5));

		// # contains()
		
		String s6 = "My name is khamer";
		String searchString = "name";
		System.out.println("Contains searchString => " + s6.contains(searchString));
				
		
	}

}
