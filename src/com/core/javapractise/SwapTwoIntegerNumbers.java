package com.core.javapractise;

public class SwapTwoIntegerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =40;
		int b =10;
		
		System.out.println("Before Swapping = > a " + a + " and b =>" + b);
		
		a = a + b; // 40+10=50
		System.out.println("a = >" + a);
		b = a - b ; //50  -10 = 40, b=40
		
		a = a-b ; // 50 - 40= 10, a=10
		System.out.println("Before Swapping = > a " + a + " and b =>" + b);

				

	}

}
