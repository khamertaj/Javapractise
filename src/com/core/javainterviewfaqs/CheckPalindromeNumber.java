package com.core.javainterviewfaqs;

/**
 * Find the number id Palindrome
 * @author USER
 * Prime Numbers such as :  454, 35653, 151, 78987, 1001
 */
public class CheckPalindromeNumber {

	public static void main(String[] args) {
		
		int num = 35653;
		int rev = 0;
		int actualNumber =  num;
		
		while ( num != 0 ) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		
		System.out.println("actualNumber: " +  actualNumber);
		System.out.println("rev: " +  rev);
		
		if (rev == actualNumber) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

}
