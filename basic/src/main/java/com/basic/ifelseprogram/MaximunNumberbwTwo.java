package com.basic.ifelseprogram;

import java.util.Scanner;

public class MaximunNumberbwTwo {

	//program to find maximum between two numbers
	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		//using without function
		int maximumNumber = getMaximumNumber(a, b);
		System.out.println("Maximum number between "+a+ "  and "+b+ " is : "+maximumNumber);

		//using Math.max function
		int greaterNumber = getGreaterNumber(a, b);
		System.out.println("Greater number between "+a+ "  and "+b+ " is : "+greaterNumber);

	}

	// using without function
	public static int getMaximumNumber(int a, int b){

		return  a>=b?a:b;
	}

	//using Math.max function
	public static int getGreaterNumber(int a, int b){
		return Math.max(a,b);
	}
}
