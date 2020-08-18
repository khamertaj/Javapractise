package com.core.javainterviewfaqs;

/**
 * WAP to generate the Fibonacci Series
 * @author USER
 * 
 * Fibona mean - addition of last two numbers 
 * 
 * 0 1 1 2 3 5 8 13 21 34 55 98 ......
 *
 */
public class FibonnaciSeries1 {

	public static void main(String[] args) {
		
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		 
		for(int i=1;i<=num;i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			
		}

	}
}
