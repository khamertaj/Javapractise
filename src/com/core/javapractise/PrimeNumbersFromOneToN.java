package com.core.javapractise;

public class PrimeNumbersFromOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("2 is prime no==>" + isPrimeNo(2));
	System.out.println("4 is prime no==>" + isPrimeNo(4));
	System.out.println("10 is prime no==>" + isPrimeNo(10));
	System.out.println("0 is prime no==>" + isPrimeNo(0));
	System.out.println("-6 is prime no==>" + isPrimeNo(-6));
	
	System.out.println("Print Prime numbers from 1 to 20");
	int n = 20;
	
	for (int i=1;i<=20;i++) {
		if (isPrimeNo(i) == true ) {
			System.out.println(i);
		}
	}


		
		
		
	}
	
	public static boolean isPrimeNo(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

}
