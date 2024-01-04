package com.basic.arrays;

import java.util.Scanner;

public class ThirdShortestElement {

	//Find out the third shortest Element in given array.

	public static void main(String[] args) {
		int length = 8;
		System.out.println("Enter input Element...");
		int thirdshortElement = getThirdShortestElement(getInputArray(length));
		System.out.println("Third shortest element = "+thirdshortElement);
	}

	public static int[] getInputArray(int length){

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static int getThirdShortestElement(int[] a){

		if(a.length<3){
			throw new IllegalArgumentException("Array size should not be less than three");
		}
		int shortestElement = a[0];
		int secondShortestElement = Integer.MAX_VALUE;
		int thirdShortestElement = Integer.MAX_VALUE;
		for(int i:a){
			if(shortestElement>i){
				thirdShortestElement = secondShortestElement;
				secondShortestElement = shortestElement;
				shortestElement = i;
			}
			else  if(secondShortestElement>i && i!=shortestElement){
				thirdShortestElement = secondShortestElement;
				secondShortestElement = i;
			}
			else if(thirdShortestElement>i && i!=secondShortestElement && i!=shortestElement){
				thirdShortestElement = i;
			}
		}
		return thirdShortestElement;
	}
}
