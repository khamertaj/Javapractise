package com.core.javainterviewfaqs;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		int x = 111000;
		int y = 400;
		int z = 600;
		
		if ((x > y) && (x > z)) {
			System.out.println(" X is greatest");
		}
		else if ((y>x) && (y >z)) {
			System.out.println("Y is greatest");
		}
		else
		{
			System.out.println("Z is greatest");
		}

	}

}
