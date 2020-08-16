package com.core.javapractise;

public class PrintOnlyAlphabetsFromAlphaNumericString {

	public static void main(String[] args) {
	
		
		// # using inbuilt function
		
		String s = "Rayan+-534343.,";
		
		for (int i = 0; i < s.length(); i++) 
        { 
  
            // Finding the character whose  
            // ASCII value fall under this 
            // range
			char c = s.charAt(i);
            if (c < 'A' || c > 'Z' && c < 'a' || c > 'z')  
            {   
                // erase function to erase  
                // the character 
                s = s.substring(0, i) + s.substring(i + 1); 
                i--; 
            } 
        } 
		
		System.out.println(s);
		
		// # Using Regex
		System.out.println("Extract only alphabets from a string using Regex");
		String s2= "Raheel87641#$52 .,";
		System.out.println(s2.replaceAll("[^a-zA-Z]","")); 
		
		
		
		
	}

}
