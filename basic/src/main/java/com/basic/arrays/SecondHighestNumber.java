package com.basic.arrays;


import java.util.Scanner;

public class SecondHighestNumber {

	//Find the second highest number in the given array

	public static void main(String[] args) {
		int length = 6;
		System.out.println("Enter input Array..");
		int secondHighestNumber = getSecondHighestNumber(getInputArray(length));
		System.out.println("Second highest Number in Array is :" + secondHighestNumber);
	}

	public static int[] getInputArray(int length) {
		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int getSecondHighestNumber(int[] a) {

		if (a.length == 0) {
			throw new IllegalArgumentException("Array size is zero");
		}
		int highestNumber = a[0];
		int secondHighestNumber = a[1];
		for (int i : a) {
			if (highestNumber < i) {
				secondHighestNumber = highestNumber;
				highestNumber = i;
			} else if (i > secondHighestNumber && i != highestNumber) {
				secondHighestNumber = i;
			}
		}
		return secondHighestNumber;
	}
}
