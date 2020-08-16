package com.core.javainterviewfaqs;

/**
 * WAP to find a alphabet is Vowel or Consonant
 * @author USER
 *
 * vowels - a e i o u
 */
public class VowelConsonant {

	public static void main(String[] args) {
		
		char alphabet = 'e';
		
		// int ascii = alphabet;
		
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ) {
			System.out.println(alphabet + " alphabet is VOWEL");
		} else {
			System.out.println(alphabet + " alphabet is Consonant");
		}
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Using Switch Case");
		
		switch (alphabet) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(alphabet + " alphabet is VOWEL");
				break;
			default:
				System.out.println(alphabet + " alphabet is Consonant");
		}
				
				

	}

}
