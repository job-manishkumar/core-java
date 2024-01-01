package com.basic.arrays;

import java.util.Scanner;

public class MultipleAndAdditionToElement {

	//program to multiple odd element of Array by 2 and add 10 to even numbers
	public static void main(String[] args) {
		System.out.println("Enter Array elements...");
		int length = 5;
		int[] arr = getInputArray(length);
		additionAndMultiple(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int[] getInputArray(int length) {

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	//multiple by 2 and add 10 to odd and even indexes of Array
	public static void additionAndMultiple(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				a[i] += 10;
			} else {
				a[i] *= 2;
			}
		}
	}
}
