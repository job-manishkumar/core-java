package com.basic.arrays;

import java.util.Scanner;

public class CountGreaterNumber {

	public static final int ARRAY_LENGTH = 5;
	public static final int ELEMENT = 10;

	//count the number of elements in given array greater than x.

	public static void main(String[] args) {

		System.out.println("enter Array element...");
		int[] a = getInputArray(ARRAY_LENGTH);
		int count = countGreaterNumber(a, ELEMENT);
		System.out.println(count + " elements are grater than " + ELEMENT);
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int countGreaterNumber(int[] a, int element) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array length is zero");
		}
		int count = 0;
		for (int i : a) {
			if (element < i) {
				System.out.println("elements which are grater than " + element + " is :" + i);
				count++;
			}
		}
		return count;
	}
}
