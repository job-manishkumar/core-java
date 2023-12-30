package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckInputType {

	//program to input any character and check whether it is alphabet, digit or special character.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.next().charAt(0);
		System.out.println(num);
		if(isAlphabet(num)){
			System.out.println("character is Alphabet");
		}
		else if (isNumber(num)){
			System.out.println("character is Number");
		}
		else {
			System.out.println("special character");
		}

	}
	public  static boolean isAlphabet(int ch){

		return  (ch >= 65  && ch <=91) || (ch >= 97 && ch <= 123) ;
	}

	public  static  boolean isNumber(int num){
		return num>=0 && num<=9;
	}
}
