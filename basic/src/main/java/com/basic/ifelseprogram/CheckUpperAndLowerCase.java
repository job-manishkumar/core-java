package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckUpperAndLowerCase {

	//program to check whether a character is Uppercase or Lowercase

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char ch = scanner.next().charAt(0);
		System.out.println(checkUpperAndLowerCase(ch));
	}

	public static String checkUpperAndLowerCase(char ch){
		boolean b = (ch >='a' && ch<='z') || (ch >='A' && ch <='Z');
		return b?(ch >='a')
				?"Lower Case":"Upper Case"
				:"Not a Alphabet";
	}
}
