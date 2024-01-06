package com.basic.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	/*selects the smallest (or largest) element from the unsorted portion
	 of the list and swaps it with the first element of the unsorted part*/

	//selection sort in natural order or increase order

	public static void main(String[] args) {

		int length = 5;

		int[] b = selectionSort(getInputArray(length));
		System.out.println("Sort array using selection sort :" + Arrays.toString(b));
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int[] selectionSort(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size must be greater than 0");
		}
		System.out.println("Actual list = " + Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			int min_index = i;// min index
			for (int j = i + 1; j < a.length; j++) {
				if (a[min_index] > a[j]) {
					min_index = j;
				}
			}
			int temp = a[i];
			a[i] = a[min_index];
			a[min_index] = temp;

			System.out.println(Arrays.toString(a));
		}
		return a;
	}
}
