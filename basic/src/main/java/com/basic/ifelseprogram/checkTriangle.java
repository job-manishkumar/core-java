package com.basic.ifelseprogram;

import java.util.Scanner;

public class checkTriangle {

	//program to check whether triangle is equilateral, scalene or isosceles
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if(isTriangle(a, b, c)){
			System.out.println("All sides can make a triangle");
		}
		else {
			System.out.println("Triangle can not be make");
		}
	}

	public static boolean isTriangle (int a, int b, int c){
		return (a+b>c && b+c>a && a+c>b);
	}
}
