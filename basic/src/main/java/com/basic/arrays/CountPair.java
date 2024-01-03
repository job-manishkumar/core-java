package com.basic.arrays;

import java.util.Scanner;

public class CountPair {

	//find the total Number of pairs in the Array whose sum is equal to given value x.

	public static void main(String[] args) {
		int length = 5;
		int number = 12;
		System.out.println("Enter Input Array...");
		int countPair = countPair(getInputArray(length), number);
		System.out.println("Pair is/are :" + countPair);
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int countPair(int[] a, int number) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == number) {
					System.out.println("pair are/is = " + a[i] + "," + a[j]);
					count++;
				}
			}
		}
		return count;
	}
}
