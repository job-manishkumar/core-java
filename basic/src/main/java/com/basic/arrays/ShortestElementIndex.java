package com.basic.arrays;

import java.util.Scanner;

public class ShortestElementIndex {

	//program to get shortest element and its index

	public static void main(String[] args) {

		int length  =5;
		System.out.println("enter the array element");
		int[] arr = getInputArray(length);
		int[] arr1 = getShortestElementIndex(arr);
		System.out.println("shortest Element is : "+arr1[0]+" and its index is :"+arr1[1]);
	}

	//input array
	public static int[] getInputArray(int length){

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i< a.length;i++){
			a[i]=scanner.nextInt();
		}
		return a;
	}

	//get the shortest element
	public static int[] getShortestElementIndex(int[] a){

		if(a.length==0){
			return  new int[]{};
		}
		int shortElement = a[0];
		int index =0;
		for(int i=0;i<a.length-1;i++){
			if(shortElement>a[i+1]){
				shortElement = a[i+1];
				index = i+1;
			}
		}

		return  new int[]{shortElement,index};
	}
}
