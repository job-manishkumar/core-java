package com.basic.ifelseprogram;

import java.util.Scanner;

public class AbsoluteNumber {

	//program to get absolute Number
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		int absoluteNum = getAbsoluteNumber(a);
		System.out.println("Absolute Number : "+absoluteNum);
	}

	public  static int getAbsoluteNumber(int num){
		return  num>=0?num:-num;
	}
}
