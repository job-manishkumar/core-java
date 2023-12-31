package com.basic.arrays;

import java.util.Scanner;

public class PrintIndexOfStudent {

	//print index of marks array if student number is less than 35
	public static void main(String[] args) {

		System.out.println("Enter Student marks of 5 subject");
		int[] arr = getStudentMarks();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<35) {
				System.out.println(i+1);
			}
		}
	}

	public static int[] getStudentMarks(){

		int[] marks = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<5;i++){
			marks[i]=scanner.nextInt();
		}
		return  marks;
	}
}