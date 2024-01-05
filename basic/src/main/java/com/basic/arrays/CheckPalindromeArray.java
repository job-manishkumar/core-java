package com.basic.arrays;

import java.util.Scanner;

public class CheckPalindromeArray {


	// check given array is palindrome or not.
	public static void main(String[] args) {

		int length = 6;
		System.out.println("Enter Input Array...");
		boolean checkPalindrome = getReverseArray(getInputArray(length));
		if (checkPalindrome) {
			System.out.println("Array is palindrome...");
		} else {
			System.out.println("Array is not palindrome...");
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

	public static boolean getReverseArray(int[] a) {

		if (a.length <= 1) {
			throw new IllegalArgumentException("Array size is zero");
		}
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			if (a[i] != a[j]) {
				return false;
			}
		}
		return true;

	}
}
