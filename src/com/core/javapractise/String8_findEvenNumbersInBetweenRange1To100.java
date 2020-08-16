package com.core.javapractise;

public class String8_findEvenNumbersInBetweenRange1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String even = "";
		
		for(int i=0; i<=100; i++) {
			if (findEvenNumber(i) == true) {
				even = even + i;
			}
		}
		
		System.out.println("All Even Numbers are ==> " + even);
	}
	
	public static boolean findEvenNumber(int num) { 
		
		if (num == 0) {
			return false;
		}
		
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}

}
