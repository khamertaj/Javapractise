package com.core.javapractise;

public class RemoveAllZerosFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # Using inbuild function
		String str1 = "0000000098776543000";
		String str2 = "";
		char[] ch = str1.toCharArray();
		
		for (int i=0; i<(ch.length); i++) {
			
			System.out.println(ch[i]);
			if(Character.getNumericValue(ch[i]) > 0 ) {
				break;
			}
			if(ch[i] != '0') {
				
				str2 = str2 + ch[i];
			}
		}
		
		System.out.println("Strinf after removing leading zero's ===> "+ str2);
		
		// #Using Replace method
		
		String str3 = "0000000000000009876543210";
		System.out.println(str3.replaceAll("0", ""));
		
		// # Using String Buffer
		
		String str4 = "12fssss567";
		StringBuffer sb = new StringBuffer(str4);
		
		char[] chars = str4.toCharArray();
		
		for(int j=0; j< chars.length ; j++) {
			char c  = chars[j];
			
			if (c == 48) {
				sb.deleteCharAt(j);
			}
			j--;
		}
		System.out.println("str4 Remove zeros from a string => " + sb);
		
		

	}

}
