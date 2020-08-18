package com.core.javainterviewfaqs;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 123457677;
		int rev = 0;
		
		
		System.out.println("Number ================> " +  num);
		while(num != 0) {
			
			int n = num % 10;
			rev = rev*10 + n;
			num = num / 10;
			
		}
		System.out.println("Reverse Integer ========> "  + rev);
		
		System.out.println("-----------------------------");
		
		System.out.println("Using String Buffer Uto reverse integer");
		
		int num1 = 1234567;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
		
	}

}
