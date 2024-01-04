package com.basic.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayIntoAnother {

	//write a program to copy the contents of one array into another array in reverse order.

	public static void main(String[] args) {

		int length = 6;
		int[] b = getReverseArray(getInputArray(length));
		System.out.println("another array in reverse order: " + Arrays.toString(b));
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
		int[] anotherArray = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			anotherArray[i] = a[a.length - 1 - i];
		}
		return anotherArray;
	}


}
