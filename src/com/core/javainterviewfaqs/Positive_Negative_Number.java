package com.core.javainterviewfaqs;

/**
 * WAP to find a number is positive or negative
 * @author USER
 *
 */
public class Positive_Negative_Number {

	public static void main(String[] args) {
		
		double number = -786;
		
		if (number >  0.0) {
			System.out.println(number + " Is Postive");
		}
		else if (number < 0.0) {
			System.out.println(number + " Is Negative");
		}
		else if ( number == 0.0) {
			System.out.println(number + " Is Zero");
		}

	}

}
