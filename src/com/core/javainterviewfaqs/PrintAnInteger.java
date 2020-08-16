package com.core.javainterviewfaqs;

import java.util.Scanner;

/**
 * WAP to Print an Integer ( Entered by the User )
 * @author USER
 *
 */
public class PrintAnInteger {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int number = scanner.nextInt();
		System.out.println("number: " +  number);
		

	}

}
