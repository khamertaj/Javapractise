package com.core.javainterviewfaqs;


/**
 * WAP to Count Digitd in an integer
 * @author USER
 *
 */
public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		
		int num = 12345;
		
		System.out.println("Solutiuon1: Using String.valueOf(num) ");
		String str = String.valueOf(num);
		System.out.println("Number of digits are: " + str.length());
		
		
		System.out.println("----------------------------------------------");
		
		int num1 = 123456789;
		int counter = 0;
		
		while ( num1 != 0 ) {
			 num1 = num1 / 10;
			 counter++;
		}
		System.out.println(counter + " number of Digits");
		

	}

}
