package com.core.javapractise;

public class ReverseeachCharInASentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "My name is Khamer Taj";
		String rev="";
		//expected output should be "Taj Khamer is name My";
		String[] wordsArray = str.split(" ");
		for(int i=(wordsArray.length-1); i>=0; i--) {
			rev+=wordsArray[i]+ " ";
		}
		System.out.println("rev = >" +  rev);
	}

}
