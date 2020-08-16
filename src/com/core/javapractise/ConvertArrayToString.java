package com.core.javapractise;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"Khammu","Taj","Samsul"};
		System.out.println("Before :: Converting an Array to String => " + array);
		String str = Arrays.toString(array);
		System.out.println("After :: Convert an Array to String => " + str );

	}
	
}
