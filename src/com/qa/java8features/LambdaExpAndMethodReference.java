package com.qa.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReference {

	public static void main(String[] args) {
		
		
		List<String> namelist = Arrays.asList("Rayyu", "Raheel","Raqeeb");
		
		System.out.println("------Using anonymous Inner class------------");
		namelist.forEach(new Consumer<String> () {

			@Override
			public void accept(String str) {
				System.out.println(str);
				
			}
			
		});
		
		System.out.println("---------using Lambda expression----");
		namelist.forEach(name -> System.out.println(name));

		System.out.println("---------using Method Reference----");
		namelist.forEach(System.out::println);
		
	}

}
