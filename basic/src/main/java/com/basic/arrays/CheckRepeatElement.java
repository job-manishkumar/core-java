package com.basic.arrays;

import java.util.Scanner;

public class CheckRepeatElement {

	//Find the first repeating element in an array of integers

	public static void main(String[] args) {
		int length = 6;
		boolean b = checkRepeatElement(getInputArray(length));
		if (b) {
			System.out.println("element are repeating ");
		} else {
			System.out.println("Element are not repeating");
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

	//complexity is O(n2)
	public static boolean checkRepeatElement(int[] a) {

		if (a.length <= 1) {
			throw new IllegalArgumentException("Array size should be greater than 1");
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Repeating element: " + a[i]);
					return true;
				}
			}
		}
		return false;
	}

}
