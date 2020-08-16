package com.core.javapractise;

public class SwapTwoStringssWithOutUsingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Khamer";
		String b = "Samsul";
		
		// Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        // append 2nd string to 1st 
        a = a + b; 
          
        // store intial string a in string b 
        int endindex = a.length()-b.length();
        b = a.substring(0,endindex); 
          
        // store initial string b in string a 
        a = a.substring(b.length()); 
          
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);   

	}

}
