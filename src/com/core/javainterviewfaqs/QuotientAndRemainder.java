package com.core.javainterviewfaqs;

/**
 * WAP to find the Quotient and Reminder
 * @author USER
 *
 */
public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		int dividend =  72 ;
		int divisor  = 5;
		
		int quotient = dividend / divisor;
		int reminder = dividend % divisor;
		
		System.out.println("Quotient: "  + quotient );
		System.out.println("reminder: "  + reminder );

	}

}
