package com.core.javapractise;

public class DifferentWaysToConvertIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1287654;
		
		// # Integer.toString()
		System.out.println("Convert Integer to String Using Integer.toString()");
		String str1 = Integer.toString(num);
		System.out.println("str1 ==> " + str1);
		
		// #String.valueOf()
		System.out.println("Convert Integer to String using String.valueOf()");
		int num2 = 7653;
		String str2 = String.valueOf(num2);
		System.out.println(" str2 ==> " + str2);
		
		// #StringBufferObj.toString StringBuilderObj.toString
		System.out.println("Convert integer to String usiing stringbuffer or stringbuilder");
		int num3 = 8902;
		StringBuffer sb= new StringBuffer();
		sb.append(num3);
		System.out.println("before converting to String = >" + sb);
		System.out.println("After converting to int = > "+ sb.toString());
		
		

	}

}
