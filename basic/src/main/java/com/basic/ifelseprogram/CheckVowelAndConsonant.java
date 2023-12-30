package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckVowelAndConsonant {

	//program to input any alphabet and check whether it is vowel or consonant.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char ch = scanner.next().charAt(0);
 		boolean isAlphabet = (ch>='a' && ch <='z')||(ch>='A'&& ch<='Z');
		if(isAlphabet && isVowelAndConsonant(ch)){
			System.out.println("Alphabet is vowel");
		}
		else if(isAlphabet){
			System.out.println("Alphabet is consonant");
		}
		else {
			System.out.println("not Alphabet");
		}
	}
	public static boolean isVowelAndConsonant(char ch){
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U';
	}
}
