package com.core.javainterviewfaqs;

/**
 * Find a program for Table multiplication
 * 
 * 2 X 1 = 2
 * 2 X 2 = 4
 * 2 X 3 = 6
 * 2 X 4 =  8
 * 2 X 5 = 10
 * @author USER
 *
 */
public class TableMultiplication {

	public static void main(String[] args) {
		
		int table = 13;
		
		for (int i =1 ;i<=10 ; i++) {
			
			System.out.println(table + "  X " + i + " = " + table * i );
		}

	}

}
