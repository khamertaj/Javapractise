package com.qa.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String> ();
		li.add("khamer Samsul Rayan Raheel Raqeeb");
		li.add("myself spouse son1 son2 son3");
		
		Stream<String> s = li.stream().flatMap((String str) -> {
		   String[ ] values = str.split(" ");
		    return Arrays.asList(values).stream();
		});
		
		List<String> li1 = (List<String>) s.collect(Collectors.toList());
		System.out.println("li1: " + li1);
		
		

	}

}
