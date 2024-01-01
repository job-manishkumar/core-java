package com.basic.arrays;

import java.util.Scanner;

public class MaximumElementIndex {

	//program to get maximum element index

	public static void main(String[] args) {

		int length = 5;
		System.out.println("Enter Array Element --- ");
		int[] a = getArray(length);
		int[] a1 =getMaximumElementAndIndex(a);
		System.out.println("Maximum Element is :" +a1[0]+" and its index is :"+a1[1]);
	}

	//input array
	public static int[] getArray(int length){

		int[] arr = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i< arr.length;i++){
			arr[i]=scanner.nextInt();
		}
		return arr;
	}

	//get maximum element and its index
	public static int[] getMaximumElementAndIndex(int[] arr){

		if(arr.length==0){
			return  new int[]{};
		}
		int maxElement = arr[0];
		int index =0;
		for(int i=0;i<arr.length-1;i++){
			if(maxElement<arr[i+1]){
					maxElement = arr[i+1];
					index =i+1;
			}
		}
		return new int[] {maxElement,index};
	}
}
