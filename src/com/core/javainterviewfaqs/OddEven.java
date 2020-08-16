package com.core.javainterviewfaqs;

import java.util.Scanner;

/**
 * WAP to find a number is EVEN or ODD
 * @author USER
 *
 */
public class OddEven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int number =  scanner.nextInt();
		
		
		if (number % 2 == 0) {
			System.out.println("Entered Number is EVEN: " +  number);
		} else {
			System.out.println("Entered Number is ODD: " +  number);
		}

	}

}
