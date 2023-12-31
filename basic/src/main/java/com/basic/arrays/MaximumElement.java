package com.basic.arrays;

public class MaximumElement {


	// find out the maximum element of given array

	public static void main(String[] args) throws IllegalAccessException {
		int[] a = {45,14,2,8,7,6,21,9,5,1,10,13,20,50};
		int maxElement = getMaxElement(a);
		System.out.println("Maximum element of array = "+maxElement);
	}

	public  static int getMaxElement(int[] arr) throws IllegalAccessException {


		if(arr.length==0){
			throw  new IllegalAccessException("Array length is zero");
		}
		int maxElement = arr[0];
		for(int i=0;i<arr.length-1;i++){
			maxElement =maxElement<arr[i+1]?arr[i+1]:maxElement;
		}
		return maxElement;
	}
}
