package com.core.javapractise;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # StringBuffer, mutable and synchronized
		// StringBuffer is mutable sequence of characters, and thread-safe, is a synchronized
		// StringBuffer are safe for use by multiple threads
		
		StringBuffer sbf =  new StringBuffer("Khamer ");
		System.out.println("Before Appending =>" + sbf);
		sbf.append("Taj");
		System.out.println("After Appending =>" + sbf);
		System.out.println("character at 2nd index => " + sbf.charAt(2));
		System.out.println("Length of string Buffer = > " + sbf.length());
		System.out.println("Reverse a String Buffer => " + sbf.reverse());		
		System.out.println("Delete Character at 9th position =>" + sbf.deleteCharAt(9));

		// Interview program, reverse a program using StringBuffer
		StringBuffer sb = new StringBuffer("Rayan Huda");
		StringBuffer rev =  sb.reverse();
		System.out.println("Reverse String = > " +  rev);
		
		
		System.out.println("<=================================>");
		// #StringBuilder, mutable and not synchronized
		
		// StringBuilder is mutable sequence of characters, and not thread-safe, is not synchronized
		// StringBuilder are not safe for use by multiple threads
		
		StringBuilder sbuilder = new StringBuilder("Asadulla Shariff");
		sbuilder.append(" My Lovely father");
		System.out.println(sbuilder);
		
		
		

	}

}
