package com.basic.ifelseprogram;

import java.util.Scanner;

public class CheckLeapYear {

	//program to check whether a year is leap year or not.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();
		boolean isLeapYear = isLeapYear(year);
		if(isLeapYear){
			System.out.println(year+" Leap Year");
		}
		else {
			System.out.println(year+ " not Leap Year");
		}
	}


	public static boolean isLeapYear(int year){
		return year % 4==0 && (year % 100!=0 || year %400==0);
	}
}
