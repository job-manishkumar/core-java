package com.basic.arrays;

import java.util.Scanner;

public class CountTriplets {

	//find the total Number of pairs in the Array whose sum is equal to given value x.
	public static void main(String[] args) {
		int length = 8;
		int number = 12;
		System.out.println("Enter Input array..");
		int count = countTriplets(getInputArray(length), number);
		System.out.println("pair :" + count);
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int countTriplets(int[] a, int n) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		int count = 0;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = i + 2; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == n) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
			}
		}
		return count;
	}
}
