package com.core.javapractise;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("list ==> " +  list1);
		if (list1.contains(2)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
		

	}

}
