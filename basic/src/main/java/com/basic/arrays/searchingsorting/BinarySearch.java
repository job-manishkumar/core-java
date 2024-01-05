package com.basic.arrays.searchingsorting;

import java.util.Scanner;

public class BinarySearch {

	//Binary search --> array should be sorted.
	public static void main(String[] args) {
		int length = 8;
		int element = 6;

		int index = binarySearch(getInputSortedArray(length), element);
		if (index == -1) {
			System.out.println("element not found ");
		} else {
			System.out.println("element found at = " + index + " index");
		}

	}

	public static int[] getInputSortedArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int binarySearch(int[] a, int element) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}

		int lowerIndex = 0;
		int highIndex = a.length - 1;

		while (lowerIndex <= highIndex) {

			int mediumIndex = (lowerIndex + highIndex) / 2;

			if (a[mediumIndex] == element) {
				return mediumIndex;
			} else if (a[mediumIndex] < element) {
				lowerIndex = mediumIndex + 1;
			} else {
				highIndex = mediumIndex - 1;
			}
		}
		return -1;
	}
}
