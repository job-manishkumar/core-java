package com.basic.arrays;

import java.util.Arrays;

public class PrintElements {

	//print the element of an array

	public static void main(String[] args) {

		int[] arr = new int[]{1,2,3,4,5};

		//using loop
		for(int i:arr){
			System.out.println("array element : "+i);
		}

		//without loop
		System.out.println(Arrays.toString(arr));
	}
}
