package com.core.javainterviewfaqs;

/**
 * WAP to find a Armstrong number
 * 153 =  1*1*1 +  5*5*5 + 3*3*3 = 1 + 125 + 27 =  155
 * @author USER
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 371;
		
		int actualnum =  num;
		double result =0;
		
		while ( num != 0) {
			
			num = num % 10;
			result = result + Math.pow(num, 3);
			actualnum = actualnum /10;
			
		}
		
		if (result == num) {
			System.out.println("number is Armstrong number");
		} else {
			System.out.println("number is not Armstrong number");
		}

	}

}	
