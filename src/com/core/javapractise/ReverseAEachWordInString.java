
package com.core.javapractise;

public class ReverseAEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "My Name is Khamer";
		String[] strArray = str.split(" ");
		String reverse = "";
		for (int i = 0; i< strArray.length; i ++) {
			reverse = reverse + resversAString(strArray[i]) + " " ;	
		}
		System.out.println("reverse String = > " +reverse);
		
		
	}
	
	public static String resversAString (String str) {
		String revword = "";
		for(int i =str.length()-1; i>=0; i-- ) {
			revword = revword + str.charAt(i);
		}
		System.out.println("rev = >" + revword);
		return revword;			
	}

}
