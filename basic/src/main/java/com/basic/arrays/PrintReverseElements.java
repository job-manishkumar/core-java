package com.basic.arrays;

public class PrintReverseElements {

	// print reverse element of array
	public static void main(String[] args) {

		int[] arr = {1,2,3,7,5,6};

		for(int i=arr.length-1;i>=0;i--){
			System.out.println("Reverse array element - "+arr[i]);
		}
	}
}
