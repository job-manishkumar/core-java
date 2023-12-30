package com.basic.ifelseprogram;

import java.util.Scanner;

public class checkNumberDivisibleBy5And11 {

	//program to check whether a number is divisible by 5 and 11 or not.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		String checkNum = checkNumber(num);
		System.out.println(checkNum);

	}
	public static String checkNumber(int num){
		return (num % 5==0 && num % 11 ==0)?"Number is divisible by 5 and 11":"Number is not divisible by 5 and 11";
	}
}
