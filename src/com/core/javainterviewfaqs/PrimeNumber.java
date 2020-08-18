package com.core.javainterviewfaqs;

/**
 * WAP to find the prime numbers between range of 1 to 100
 * @author USER
 * Prime = a number is divisible by 1 and itself
 * What is the lowest prime number : 2
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 
 */
public class PrimeNumber {

	public static void main(String[] args) {
	
		// prime numbers between 1 - 13
		int num = 97;
		
		
		System.out.println(checkPrime(num)? num +" is Prime Number" : num + " is not prime number");
		//System.out.println(checkPrime(14));
		//System.out.println(checkPrime(15));
	}

	
	public static boolean checkPrime(int number) {
		
		if (number <= 1) {
			return false;
		}
		
		for ( int i=2; i< number; i++) {
			
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
