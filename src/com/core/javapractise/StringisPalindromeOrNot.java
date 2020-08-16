package com.core.javapractise;

public class StringisPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Raqeeb";
		String rev = "";
		int stringLen=str.length();
		
		for(int i=(stringLen-1); i>=0; i--) {
			rev+=str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindome");
		}
	}

}
