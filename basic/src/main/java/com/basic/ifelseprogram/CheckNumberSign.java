package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckNumberSign {

	//program to check whether a number is negative, positive or zero.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		String checkNumber = checkNumber(a);
		System.out.println(checkNumber);
	}


	//using if else
	public static String checkNumber(int a){
		if(a>0){
			return "Number is positive";
		}
		else if(a<0){
			return "Number is Negative";
		}
		else{
			return "Number is Zero";
		}
	}
}
