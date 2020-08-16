package com.core.javainterviewfaqs;

public class CheckPalindromOfString {

	static String reverseString = "";
	static String str = "";
	
	public static void main(String[] args) {
		
		str = "malayalam";
		System.out.println(checkPalindrome(str));

	}
	
	public static Boolean checkPalindrome(String str) {
		
		if(str == null) {
			return false;
		}
		
		if (str.equals(reverseString(str))) {
			return true;
		}
		
		return false;
	}
	
	
	
	public static String reverseString(String str1) {
		
		int len = str1.length();
				

		for (int i=len-1; i>=0 ; i--) {
			reverseString = reverseString + str1.charAt(i);	
		}
		System.out.println(reverseString);
		return reverseString;
		
	}
}
