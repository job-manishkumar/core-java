package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckAlphabet {

	//program to check whether a character is alphabet or not.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		boolean isAlphabet = isAlphabet(ch);

		if(isAlphabet){
			System.out.println("character is alphabet");
		}
		else {
			System.out.println("character is not alphabet");
		}
	}
	public static boolean isAlphabet(char ch){
		return (ch>='a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'Z');

	}
}
