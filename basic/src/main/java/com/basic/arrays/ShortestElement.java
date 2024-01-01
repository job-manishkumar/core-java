package com.basic.arrays;

import java.util.Scanner;

public class ShortestElement {

	// find out the shortest element of given array
	public static void main(String[] args) {
		System.out.println("Enter the length of the array...");
		Scanner scanner= new Scanner(System.in);
		 int length = scanner.nextInt();
		System.out.println("Enter Array elements..");
		int[] array=  getInputElement(length);
		int shortestElement = getShortestElement(array);
		System.out.println("Shortest Element in Array: "+shortestElement);
	}

	//get array element as input
	public static int[] getInputElement(int length){

		int[] arr = new int[length];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]= scanner.nextInt();
		}
		return  arr;
	}

	//find out shortest element
	public static int getShortestElement(int[] arr){

		if(arr.length==0){
			return -1;
		}
		int minElement = arr[0];
		for(int i=0;i<arr.length-1;i++){
			minElement = minElement<arr[i+1]?minElement:arr[i+1];
		}
		return  minElement;
	}

}
