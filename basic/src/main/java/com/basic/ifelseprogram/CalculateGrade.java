package com.basic.ifelseprogram;

import java.util.Scanner;

public class CalculateGrade {

	//program to enter student marks and find percentage and grade
/*	if percentage >= 90% : Grade A
	If percentage >= 80% : Grade B
	If percentage >= 70% : Grade C
	If percentage >= 60% : Grade D
	If percentage >= 40% : Grade E
	If percentage < 40% : Grade F*/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int physicsMark = scanner.nextInt();
		int chemistryMark = scanner.nextInt();
		int biologyMark = scanner.nextInt();
		int  mathMark = scanner.nextInt();
		int computerMark = scanner.nextInt();

		int percentage = getPercentage(physicsMark,chemistryMark,biologyMark,mathMark,computerMark);
		if(percentage>=90){
			System.out.println("Grade A");
		}
		else if(percentage>=80){
			System.out.println("Grade B");
		}
		else if(percentage>=70){
			System.out.println("Grade C");
		}
		else if(percentage>=60){
			System.out.println("Grade D");
		}
		else if(percentage>=40){
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}
	}

	public static int getPercentage(int mark1, int mark2, int mark3, int mark4, int mark5){
		return (mark1+mark2+mark3+mark4+mark5)/5;
	}
}
