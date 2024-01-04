package com.basic.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayWithOutAnother {


	public static void main(String[] args) {

		//write a program to copy the contents of one array without another array in reverse order.

		int length = 9;
		int[] b = getReverseArray(getInputArray(length));
		System.out.println("Reverse Order array :" + Arrays.toString(b));
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int[] getReverseArray(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		for (int i = 0; i < a.length / 2; i++) {
			a[i] = a[i] + a[a.length - 1 - i];
			a[a.length - 1 - i] = a[i] - a[a.length - 1 - i];
			a[i] = a[i] - a[a.length - 1 - i];
		}
		return a;
	}
}
