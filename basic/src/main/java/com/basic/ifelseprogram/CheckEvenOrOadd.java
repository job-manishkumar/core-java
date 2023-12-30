package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckEvenOrOadd {

	//program to check whether a number is even or odd.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		boolean checkNum1 = checkEvenOddNumber(a);
		if(checkNum1){
			System.out.println(a+" Number is Even");
		}
		else {
			System.out.println(a+ " Number is Odd");
		}

		boolean checkNum2 = checkEvenOddNumber2(a);
		if(checkNum2){
			System.out.println(a+" Number is Even");
		}
		else {
			System.out.println(a+ " Number is Odd");
		}

	}

	//using if-else
	public static boolean checkEvenOddNumber(int a){
		if(a % 2==0)
			return true;
		else {
			return  false;
		}
	}

	//using without if-else
	public static boolean checkEvenOddNumber2(int b){
		return b % 2==0;
	}
}
