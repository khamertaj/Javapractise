package com.core.javapractise;

public class SingletonLazyInstantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC obj1 = ABC.getInstance();
		ABC obj2 = ABC.getInstance();
		
	}

	
	public static class ABC {
		static ABC abcObj = new ABC();
		
		private ABC() {
			System.out.println("ABC Singleton Class is Created");
		}
		
		static ABC getInstance() {
			return abcObj;
		}
		
	}
}
