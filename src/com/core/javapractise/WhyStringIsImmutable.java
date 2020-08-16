package com.core.javapractise;

public class WhyStringIsImmutable {

	public static void main(String[] args) {
		// String class is immutable, all the objects Created by String literal will be stored in String constant pool which is in Heap memory.
		// And all the String references such as str1, str2, str3 will be stored in Stach memory
		// String Objects Created with a new keyword, will be stored in Heap memory, this again check whether the object is already present in String constant Pool 
		//  - if the object is already present in String pool, it will restored the address of it in a Heap memory.
		// So In this case of String, it is Immutable
		
		// Advantages:
		// It Increases the performance of the system.
		// Different Object references pointing to the same Object present in the Pool
		
		String str1 = "Khamer Taj";
		System.out.println(str1);
		String str2 = "Rayan";
		System.out.println(str2);
		String str3 =  new String("Rayan");
		System.out.println(str3);

	}

}
