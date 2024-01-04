package com.basic.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {


	// Rotate the given array by k steps , where k is a non-negative number.
	public static void main(String[] args) {

		int length = 8;
		int steps = 7;
		int[] b = rotateArray(getIInputArray(length), steps);
		System.out.println("rotate Array by " + steps + " : " + Arrays.toString(b));

	}

	public static int[] getIInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int[] rotateArray(int[] a, int steps) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}

		for (int i = 1; i <= steps; i++) {

			int lastElement = a[a.length - 1];
			for (int j = 0; j < a.length - 1; j++) {
				a[a.length - j - 1] = a[a.length - j - 2];
			}
			a[0] = lastElement;
		}
		return a;
	}
}
