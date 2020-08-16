package com.qa.java8features;

@FunctionalInterface 
public interface Webpage {
	
	public abstract void header (String headerLabel, String headerValue);
	//void Secondheader (String header2);

	public default void headerTwo() {
		
	}
	
    public default void headerThree() {
		
	}
}
