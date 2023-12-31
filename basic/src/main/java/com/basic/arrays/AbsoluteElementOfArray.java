package com.basic.arrays;

public class AbsoluteElementOfArray {

	// make all absolute value of all element of array
	public static void main(String[] args) {

		int[] arr = {1, 6,7,-7,-3,0,-1};
		for(int i:arr){
			int value = getAbsoluteValue(i);
			System.out.println("absolute value = "+value);
		}
	}

	public static int getAbsoluteValue(int num){
		return num>=0?num:-num;
	}

}
