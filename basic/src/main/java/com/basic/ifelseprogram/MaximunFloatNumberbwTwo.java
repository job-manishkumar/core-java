package com.basic.ifelseprogram;

import java.util.Scanner;

public class MaximunFloatNumberbwTwo {

	//program to find maximum between two numbers.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		double maxNumber = getMaxFloatNumber(a, b);
		System.out.println("Max Number :"+maxNumber);
	}

	//using Math.max function
	public static double getMaxFloatNumber(double a, double b){
		return  Math.max(a, b);
	}
}
