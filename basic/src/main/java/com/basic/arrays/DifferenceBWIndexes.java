package com.basic.arrays;

import java.util.Scanner;

public class DifferenceBWIndexes {

	public static final int ARRAY_LENGTH = 5;
	//Print difference b/w odd indexed and even indexed elements

	public static void main(String[] args) {

		System.out.println("Enter Array Element...");
		int total = getOddEvenIndexElementDiff(getInputArray(ARRAY_LENGTH));
		System.out.println("Total Difference b/w Odd and Even index eleements is :" + total);
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int getOddEvenIndexElementDiff(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array length is zero");
		}
		int oddIndexSum = 0;
		int evenIndexSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				evenIndexSum += a[i];
			} else {
				oddIndexSum += a[i];
			}
		}
		return evenIndexSum - oddIndexSum;
	}
}
