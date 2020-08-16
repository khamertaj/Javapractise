package com.core.javainterviewfaqs;

// WAP to Program to Remove Special Characters / JUNK  from a String

public class RemoveSpecialCharsOrJunksFromString {

	public static void main(String[] args) {
		
		System.out.println("Using Regular Expression.");
		
		String str = "&^%$ rayan 100890 %%";
		
		System.out.println(str.replaceAll("[a-zA-Z0-9]",""));
		
		//If we are NOT passing ^ ===> Output would be "&^%$   %%" ===> IT exclude all the characters from a-z, A-Z, 0-9
		
		System.out.println(str.replaceAll("[^0-9a-zA-Z]", ""));

	}

}
