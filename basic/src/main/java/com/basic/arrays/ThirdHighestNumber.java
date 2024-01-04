package com.basic.arrays;

import java.util.Scanner;

public class ThirdHighestNumber {

	//find out the Third Highest Number in the given array.
	public static void main(String[] args) {
		int length = 8;
		System.out.println("Enter Input Array...");
		int thirdHighestNum = getNHighestNumber(getInputArray(length));
		System.out.println("Third Highest Number :" + thirdHighestNum);
	}

	public static int[] getInputArray(int length) {
		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int getNHighestNumber(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		int highestNumber = a[0];
		int secondHighestNumber = Integer.MIN_VALUE;
		int thirdHighestNumber = Integer.MIN_VALUE;

		for (int i : a) {
			if (i > highestNumber) {
				thirdHighestNumber = secondHighestNumber;
				secondHighestNumber = highestNumber;
				highestNumber = i;
			} else if (i > secondHighestNumber && i != highestNumber) {
				thirdHighestNumber = secondHighestNumber;
				secondHighestNumber = i;
			} else if (i > thirdHighestNumber && i != secondHighestNumber && i != highestNumber) {
				thirdHighestNumber = i;
			}
		}
		return thirdHighestNumber;

	}
}
