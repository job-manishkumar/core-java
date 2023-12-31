package com.basic.arrays;

import java.util.Scanner;

public class CalculateSumoOfElements {

	//calculate sum of all elements of an array

	public static void main(String[] args) {
		int sizeOfArray =5;
		System.out.println("Enter "+sizeOfArray+ " of Array");
		int[] arr =getElement(sizeOfArray);
		int sumOfArray = getSum(arr);
		System.out.println("Sum of array element - "+sumOfArray);
	}

	//get input of array
	public static int[] getElement(int sizeOfArray){

		int[] elements = new int[sizeOfArray];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<sizeOfArray;i++){
			elements[i]= scanner.nextInt();
		}
		return elements;
	}

	//calculate sum of all element of array
	public static  int getSum(int[] arr){
		int sum=0;
		for(int i:arr){
			sum=sum+i;
		}
		return  sum;
	}
}
