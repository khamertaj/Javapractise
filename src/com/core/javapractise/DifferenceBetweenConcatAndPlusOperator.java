package com.core.javapractise;

public class DifferenceBetweenConcatAndPlusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Difference between concat() and + operator in Java
		
		// #1
		// concat() Method
		// The Java String concat() method concatenates one string to the end of another string.
		// This method returns a string with the value of the string passed into the method, appended to the end of the string.

		String s = "Gfg"; 
        s = s.concat("! is the best."); 
        System.out.println(s); 
        
        // +  operator
        // + operator is used to concatenate strings on either side.
        
        String s1="Taj";
        String s2="khamer";
        String s3 = s1 + "***" +  s2;
        System.out.println("s3 => " + s3);
        
        // #2
        // concat() method takes only one argument of string and concat it with other string.
        // + operator takes any number of arguments and concatenates all the strings.
        
        // #3
        // concat() method throws NullPointer Exception when string is concatenated with null
        // + operator did not raise any Exception when the string is concatenated with null.
        
        String s4 = "rayan";
        // System.out.println(s4.concat(null));
        
        System.out.println(s4 + null);
        
        
	}

}
