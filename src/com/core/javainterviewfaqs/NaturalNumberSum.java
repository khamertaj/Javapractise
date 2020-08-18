package com.core.javainterviewfaqs;

/**
 * WAP to sum the natural numbers till 100
 * @author USER
 *
 */
public class NaturalNumberSum {

	public static void main(String[] args) {
		
		int num = 100;
		int sum = 0;
		
		for ( int i=1;i<= num;i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of natural numbers till 100 : " +  sum );

		System.out.println("-------------------------------------------------");
		
		int sum1 = 0;
		int k=1;
		int num1 =100;
		
		while(k<=num1) {
			sum1 = sum1 + k;
			k++;
		}
		System.out.println("sum is: " + sum1);
	}

}
