package com.basic.arrays.searchingsorting;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	//Linear Searching in 1-D array.
	public static void main(String[] args) {
		System.out.println("Enter array length...");
		int length = getArrayLength();
		System.out.println("Input array of length " + length);
		int[] a = getInputArray(length);
		System.out.println("enter element need to be search in arary :");
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		boolean isPresent = getLinearSearch(a, element);
		if (isPresent) {
			System.out.println("element " + element + "  is present in array " + Arrays.toString(a));
		} else {
			System.out.println("element " + element + "  is not present is array " + Arrays.toString(a));
		}
	}

	public static int getArrayLength() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static boolean getLinearSearch(int[] a, int element) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		for (int i : a) {
			if (element == i) {
				return true;
			}
		}
		return false;
	}
}
