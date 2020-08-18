package com.core.javainterviewfaqs;

import java.util.Arrays;

public class FibonnaciSeries3 {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println((fibo(20)));
	}
	
	/**
	 * Returns last fibonacci number
	 * @param n
	 * @return nth fibinacci number
	 */
	public static int fibo(int n){
		  
		  int [] temp = new int[n+1];
		  
		  temp[0]=1;
		  temp[1]=1;
		  for(int i=2;i<=n;i++){
		   
		   temp[i]=temp[i-1]+temp[i-2];
		   
		  }
		  System.out.println(Arrays.toString(temp));
		  return temp[n]; 
		 }
}
