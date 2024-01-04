package com.basic.arrays;

import javax.management.StandardEmitterMBean;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {


	// Rotate the given array by k steps , where k is a non-negative number.
	public static void main(String[] args) {

		int length = 8;
		int steps = 3;
		//method 1
		int[] b = rotateArray(getIInputArray(length), steps);
		System.out.println("rotate Array by " + steps + " : " + Arrays.toString(b));

		//method 2
		int[] b1 = reverseOrder(getIInputArray(length), 0, 8);
		int[] b2 = reverseOrder(b1, 0, steps);
		reverseOrder(b2, steps, length);
		System.out.println("Reverse Array : " + Arrays.toString(b1));


	}

	public static int[] getIInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	// Method 1 with O(n2) complexity
	public static int[] rotateArray(int[] a, int steps) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		if (steps > a.length) {
			steps = steps % a.length;
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

	//Method 2 with O(n) complexity using reverse array
	public static int[] reverseOrder(int[] a, int start, int end) {

		if (a.length <= 1) {
			throw new IllegalArgumentException("Array size must be greater than 1 for reverse");
		}
		for (int i = start, j = end - 1; i < j; i++, j--) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		return a;
	}

}
