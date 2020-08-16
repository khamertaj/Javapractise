package com.qa.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterface_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> func = num -> { return (num > 5); } ;

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		List<Integer> colList1 = numbers.stream().filter(func).collect(Collectors.toList());
		System.out.println("ColList1: " +  colList1);
		
		// Predicate with &&
		List<Integer> colList2 = numbers.stream().filter(num -> num>5 && num<9).collect(Collectors.toList());
		System.out.println("ColList2: " +  colList2);
		
		//Predicate with negate
		
		List<String> names = Arrays.asList("khamer","khammu","kham","Rayan","Raheel","Raqeeb","Asharaf");
		Predicate<String> namesFunc = (name) -> {return name.startsWith("kha");};
		List<String> filteredData = names.stream().filter(namesFunc.negate()).collect(Collectors.toList());
		System.out.println(filteredData);
		
		
		
	}

}
