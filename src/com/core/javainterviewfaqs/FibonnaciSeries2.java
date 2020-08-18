package com.core.javainterviewfaqs;

import java.util.Arrays;
import java.util.Scanner;

public class FibonnaciSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k, a , b;
		a = 1;
		b = 1;
		k = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int num = sc.nextInt();
		System.out.print(" 1 1 ");
		while(k <= num) {
			
			k = a + b;
			System.out.print(k + " ");
			a = b;
			b = k;
			
		}

	}
	
	

}
