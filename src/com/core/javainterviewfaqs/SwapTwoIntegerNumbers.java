package com.core.javainterviewfaqs;

public class SwapTwoIntegerNumbers {

	public static void main(String[] args) {
	int a = 10;
	int b = 5;
	
	System.out.println("Swap two integers without using TEMP / third variables");
	System.out.println("Values Before swap:: a => " + a + " And b=>" + b);
	a = a + b;      // a=15
	b = a - b;		// b=15-5 =10
	a = a - b;   	// a=15-10=5
	
	System.out.println("Values after swap:: a => " + a + " And b=>" + b);
	
	System.out.println("-----------------------------------------------");
	
	System.out.println("Swap two numbers with using third number/ temp variable");
	
	int x = 10;
	int y= 15;
	int temp = 0;
	System.out.println("Before swap: x => " + x + " And y=> " + y );
	temp = x ; 
	x = y;
	y =temp;
	
	System.out.println("Before swap: x => " + x + " And y=> " + y );

	}

}
