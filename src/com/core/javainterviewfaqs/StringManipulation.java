package com.core.javainterviewfaqs;

public class StringManipulation {

	public static void main(String[] args) {

		System.out.println("Get the length of an String");
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";

		int len = str.length();
		System.out.println("find the Length of a String::: " +  len);
		System.out.println("find the Char at 5 position::: " +  str.charAt(5));
		System.out.println("find the first occurrence of  char 'r' ::: " + str.indexOf('a')); // It Gives me the first occurrences of char 'a'
		System.out.println("find the Second occurrence of  char 'r' ::: " + str.indexOf('a', str.indexOf('a') + 1)); // It second occurrence of char 'a'
		System.out.println("find the indexOf a sub string in a string::: "  + str.indexOf("have"));
		System.out.println("find the indexOf a non-Existing string in a string::: "  + str.indexOf("taj"));
		
		
		// "String Comparison");
		System.out.println("Str =>" + str + " ::AND:: str1 =>" + str1 +"  are equal::: " + str.equals(str1));
		System.out.println("Str =>" + str + " ::AND:: str1 =>" + str1 +"  are equal::: " + str.equalsIgnoreCase(str1));
		
		//Substring
		System.out.println("Find a SUB String of ::: " +  str.substring(0, 10));
			
		//trim
		String str2 = "              khamer rayan          ";
		System.out.println("Remove head and trails spaces from a string using TRIM " + str2);
		System.out.println(str2.trim());
		
		//replace
		String date = "19-02-2016";
		System.out.println("Old date:: "  + date);
		String newdate = date.replace('-', '/');
		System.out.println("New date: " + newdate);
		
		//split
		System.out.println("Split a String");
		String str3 = "Hello_World_am_here_to_get_into_product";
		String[] words = str3.split("_");
		for (String word: words) {
			System.out.println(word);
		}
		
		// concat
		String str4 = "Khamer";
		String str5 = "Taj";
		System.out.println("Concat str1, str2==> " +  str4.concat(str5));
		
		// Concat a string with numbers gives string 
		String x = "Hello";
		String y = "world";
		int a = 200;
		int b = 300;
		System.out.println("x + y :::: " + x + y);
		System.out.println("a + b :::: " + a + b);
		System.out.println("x + y + a + b :::: " + (x+y+a+b));
		System.out.println("x + y + ( a + b ) :::: " + (x+y+ (a+b)));
		
	}

}
