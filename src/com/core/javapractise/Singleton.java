package com.core.javapractise;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC obj1 = ABC.getInstance();
		ABC obj2 = ABC.getInstance();
		
	}
	public static class ABC {
		static ABC abcObj;
		
		private ABC() {
			System.out.println("ABC Singleton Class is Created");
		}
		
		static ABC getInstance() {
			if (abcObj == null) {
			abcObj = new ABC();
			}
			return abcObj;
		}	
	}
}
