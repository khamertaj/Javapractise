package com.core.javapractise;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # sing build in way
		String str = "My name is khamer Taj";
		int stringlen = str.length();
		String rev = "";
		for(int i = (stringlen-1); i>=0; i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reverse a String => " +rev);
		
		
		// # using reverse method of StringBuffer Or StringBuilder
		StringBuffer sbf = new StringBuffer("Why I got Married!");
		System.out.println(sbf.reverse());
		
		
		// # Using toCharArray
		String str3 = "Raqeeb";
		char[] chars = str3.toCharArray();
		String rev1="";
		
		for (int i = chars.length - 1 ; i>=0; i--) {
			rev1 = rev1 + chars[i];
		}
		System.out.println("Reverese string Using toCharArray method ==> " + rev1);
		

	}

}
