package com.core.javapractise;



/**
 * Print only Numbers from a alphanumberic Strings
 * @author khamer
 * ASCII numbers for 0 to 9 if 48 to 57
 *
 */
public class PrintOnlyNumbersFromAAlphaNumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alphanumbericString = "90353RTAHH h^%$.69328";
		
		StringBuffer sb = new StringBuffer(alphanumbericString);
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)<48 || sb.charAt(i)>57) {
				sb.deleteCharAt(i);
				i--;
			}
		}

		System.out.println("Str = >" + sb);
		
		
		// # Using Regex
		String s2= "Raheel87641#$52 .,";
		System.out.println(s2.replaceAll("[^0-9]",""));
	}

}
