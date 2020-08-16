package com.core.javainterviewfaqs;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		
		System.out.println(isNumeric("Hello World!"));
		System.out.println(isNumeric("123456"));
		System.out.println(isNumeric("-90877"));
	}
	
	
	public static Boolean isEmpty(CharSequence cs) {
		
		return cs == null || cs.length() == 0 ;
		
	}
	
	public static Boolean isNumeric(CharSequence cs) {
		
		if (isEmpty(cs) ) {
			return false;
		}
		
		int len = cs.length();
		
		for (int i = 0 ; i< len ; i++) {
			
			if (! (Character.isDigit(cs.charAt(i)) ) ) { 
				return false;
			}
			
		}
		return true;
	}

}
