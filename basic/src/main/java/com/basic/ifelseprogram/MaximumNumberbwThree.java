package com.basic.ifelseprogram;

import java.util.Scanner;

public class MaximumNumberbwThree {

	//program to find maximum between three numbers.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int maxNumber1 = getMaxNumber(a, b, c);
		System.out.println("without function Maximum Number :"+maxNumber1);

		int maxNumber2 = getMaxNumber2(a, b, c);
		System.out.println("with function Maximum Number: "+maxNumber2);

	}

	//without function
	public static int getMaxNumber(int a, int b, int c){
		//return c>((a>=b)?a:b)?c:(a>=b)?a:b);
		int d = (a>=b)?a:b;
		return c>d?c:d;
	}

	//with function
	public static int getMaxNumber2(int a, int b, int c){
		int d =  Math.max(a,b);
		return  Math.max(c,d);
	}
}
