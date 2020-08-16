package com.core.javainterviewfaqs;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		
		
		int[] numbers = { -99,7,45,65678,12,34 };
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		int len =  numbers.length;
		
		for (int i =0 ; i< len; i++) {
			
			if (numbers[i] > largest) {
				largest = numbers[i];
			} 
			else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("Array: " +  Arrays.toString(numbers));
		System.out.println("Largest number==>" +  largest);
		System.out.println("Smallest number==>" +  smallest);

	}

}
