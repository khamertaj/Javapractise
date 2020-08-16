package com.core.javapractise;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// # Using replace() method
		System.out.println("Remove white spaces using String.replace() method");
		String str = "my name is khamer taj";
		String str2 = str.replace(" ", "");
		System.out.println("string after removing spaces ==> " + str2);
		
		// # Using regular expresion and replaceAll
		
		String str3 = "I love My Country";
		System.out.println(str3.replaceAll("\\s",""));

	}

}
