package com.core.javapractise;

import java.util.Scanner;

public class GetStringsFromUserConcatAndFindLengthOfStringAndConvertToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		String s1, s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings:");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		// performed concatenation
		
		System.out.println(s1 + " "+s2);
		
		// get the length of string
		 System.out.println(s2.length());
		 
		 // convert to Uppercase
		 
		 System.out.println(s2.toUpperCase());


	}

}
