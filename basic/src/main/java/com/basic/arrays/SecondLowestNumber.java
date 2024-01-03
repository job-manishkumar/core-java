package com.basic.arrays;

import java.util.Scanner;

public class SecondLowestNumber {

	//Find the second-shortest number in the given array
	public static void main(String[] args) {
		int length = 6;
		System.out.println("Enter input Array..");
		int shortestNumber = getSecondShortestNumber(getInputArray(length));
		System.out.println("Second shortest Number ; "+shortestNumber);
	}

	public static int[] getInputArray(int length){

		int[] a = new int[length];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i] = scanner.nextInt();
		}
		return  a;
	}



	public static int getSecondShortestNumber(int[] a){

		if(a.length ==0){
			throw  new IllegalArgumentException("Array size is zero");
		}
		int shortestNumber = a[0];
		int secondShortestNumber  = Integer.MAX_VALUE;
		for(int i:a){
			if(i<shortestNumber){
				secondShortestNumber = shortestNumber;
				shortestNumber = i;
			}
			else if(i<secondShortestNumber && i!=shortestNumber){
				secondShortestNumber = i;
			}

		}
		return secondShortestNumber;
	}
}
