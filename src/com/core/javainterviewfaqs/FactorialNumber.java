package com.core.javainterviewfaqs;

/**
 * WAP to find the factorial of number
 * 
 * 5! =  5 * 4 * 3 * 2 * 1 = 120
 * @author USER
 *
 */
public class FactorialNumber {

	public static void main(String[] args) {
		
		int number = 5;
		System.out.println("Factorial of " +  number +  " is :::: "+  factorial(number));

	}
	
	public static Integer factorial (int number) {
		
		int factorial = 1;
		
		for ( int i =1; i<=number; i++) {
			factorial = factorial * i;
		}	
		return factorial;
	}

}
