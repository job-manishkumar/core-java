package com.basic.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSelectionSort {


	//Reverse Selection sort (sorting in decreasing order)
	public static void main(String[] args) {

		int length = 6;
		int[] b = reverseSelectionSort(getInputArray(length));
		System.out.println("Reverse selectiion sort :" + Arrays.toString(b));
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int[] reverseSelectionSort(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size can not zero");
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
