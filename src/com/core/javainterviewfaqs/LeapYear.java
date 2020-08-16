package com.core.javainterviewfaqs;

/**
 * WAP to find the Leap Year
 * @author USER
 *
 * Leap Year is Year which has 366 Days in it including 29 day of february ,it occurs in every four years
 * 
 * A year is leap year if the following conditions are satisfied:

	Year is divisible by 400.
	Year is divisible of 4 and not divisible by 100.
	
	Century Year is Leap Year if its perfectly divisible by 400
 */
public class LeapYear {

	public static void main(String[] args) {
		
		int year = 2000;
		
		boolean leap = false;
		
		System.out.println(checkLeapYear(year)? "Leap Year" : " Not a Leap Year");
	}
	
	public static boolean checkLeapYear(int year) {
		
		//boolean leap = false;
		if ( (year % 400 == 0) || ( year % 4 == 0 ) && ( year%100 != 0) ){
			return true;
		} else {
			return false;
		}
		
		/*
		 * if (leap == true) { System.out.println(year + " Is Leap Year"); } else {
		 * System.out.println(year + "is not a Leap year"); }
		 */
		
	}
	
	
	

}
