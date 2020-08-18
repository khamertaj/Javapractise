package com.core.javainterviewfaqs;

/**
 * WAP A program to find the character is alphabet or not
 * @author USER
 *
 *	ASCII number A - Z ==> 65 - 90
 *	ASCII number a - z ==> 97 - 122
 */
public class CharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		
		char ch = '4';
		
		if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
			System.out.println(ch + " character is alphabet");	
		} else {
			System.out.println(ch + " character is not alphabet");
		}
		
		System.out.println(checkAlphabet('0')?"Is Alphabet": "Is not alphabet");
		System.out.println(checkAlphabet('A')?"Is Alphabet": "Is not alphabet");
		System.out.println(checkAlphabet('Z')?"Is Alphabet": "Is not alphabet");
		System.out.println(checkAlphabet('a')?"Is Alphabet": "Is not alphabet");
		System.out.println(checkAlphabet('z')?"Is Alphabet": "Is not alphabet");
		System.out.println(checkAlphabet('$')?"Is Alphabet": "Is not alphabet");
		System.out.println(checkAlphabet('@')?"Is Alphabet": "Is not alphabet");
	}

	public static boolean checkAlphabet(char ch) {
		if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			return true;
		} else {
			return false;
		}
	}
}
