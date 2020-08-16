package com.qa.java8features;

public class TestInterface implements Interface1, Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface test = new TestInterface();
		test.show() ;
	}

	public void show() {	
		Interface1.super.show();
		Interface2.super.show();
	}

}
