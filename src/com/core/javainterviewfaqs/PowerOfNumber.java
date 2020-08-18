package com.core.javainterviewfaqs;

/**
 * Calculate the power of number
 * @author USER
 * 	2 ^ 2 = 4,
 * 	2 ^ 3 = 8,
 * 	2 ^ 4 = 16,
 *	
 */
public class PowerOfNumber {

	public static void main(String[] args) {
		
		int base = 4;
		int exponent = 3;
		
		long result = 1;
		
		while (exponent != 0) {
			
			result = result * base;
			 --exponent;
		}
		System.out.println("Result: " + result);

		
		System.out.println("---------------------------");
		
		System.out.println(Math.pow(base, exponent));
	}

}
