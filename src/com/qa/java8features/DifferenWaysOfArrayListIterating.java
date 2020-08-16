package com.qa.java8features;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DifferenWaysOfArrayListIterating {

	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<String>();
		books.add("Book1");
		books.add("Book2");
		books.add("book3");
		books.add("Book4");
		
		System.out.println("1-Iterating using forEach method and Lambda expression");	
		books.forEach(book -> System.out.println(book));
		
		System.out.println("2-Iterate Arraylist using Iterator() method");
		java.util.Iterator<String> values = books.iterator();
		
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		
		System.out.println("3- Iterate using enhanced for loop");	
		for(String str: books) {
			System.out.println(str);
		}
		
		System.out.println("4-Iterate using order/indes");
		
		for (int i=0;i<books.size();i++) {
			System.out.println(books.get(i));
		}

		System.out.println("5-Iterate using ListIterator");
		ListIterator<String> values1 =books.listIterator();
		
		while(values1.hasNext()) {
			System.out.println(values1.next());
		}
	}

}
