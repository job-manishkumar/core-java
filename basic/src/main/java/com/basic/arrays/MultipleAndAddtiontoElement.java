package com.basic.arrays;

import java.util.Arrays;

public class MultipleAndAddtiontoElement {

	//program to multiple odd element of Array by 2 and add 10 to even numbers
	public static void main(String[] args) {
		 int[] a= {1,2,3,4,5,6,7,8,9};
		 int[] a1=new int[a.length];

		 for(int i=0;i<a.length;i++){
			 if(a[i] %2!=0){
				a1[i]=a[i]*2;
			 }
			 else {
				 a1[i]=a[i]+10;
			 }
		 }
		System.out.println(Arrays.toString(a1));
	}
}
