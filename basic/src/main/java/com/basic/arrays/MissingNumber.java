package com.basic.arrays;

import java.util.Scanner;

public class MissingNumber {

	//Find the Missing Number in sequence series from 1 to 10 array.

	public static void main(String[] args) {
		int length = 9;
		int missingNumber = getMissingElement(getInputArray(length));
		System.out.println("Missing Number from 1 to 10 is :" + missingNumber);
	}


	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int getMissingElement(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return ((a.length + 1) * (a.length + 1) + (a.length + 1)) / 2 - sum;
	}

}


