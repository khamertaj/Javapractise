package com.core.javainterviewfaqs;

/**
 * WAP to find missing numbers in an Array
 * @author USER
 *
 */
public class MissingNumbers {

	public static void main(String[] args) {
		
		// add array numbers =====>      1+2+4+5 = 12   ===> [ sum = 12 ]
		
		// add numbers range from 1 to 5 ===> 1+2+3+4+5 = 15 ===> [ sum1 =15]
		
		int a[] = {1,2,4,5,6,7,8,9,10};
		int sum = 0;
		
		//Step1: sum of all numbers in an array
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum : " +  sum);
		
		
		//step2: sum of all numbers in range from  1 to 10
		int sum1 = 0;
		for(int j=1;j<=10;j++) {
			sum1 = sum1 + j;
		}
		System.out.println("sum1: " + sum1);
		//step3: substract sum1 - sum = missing number
		
		System.out.println("Missing Number:    " + (sum1 - sum));
		
		

	}

}
