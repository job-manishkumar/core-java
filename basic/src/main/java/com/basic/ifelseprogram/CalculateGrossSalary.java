package com.basic.ifelseprogram;

import java.util.Scanner;

public class CalculateGrossSalary {

	//program to input basic salary of an employee and calculate its Gross salary according to following:

	/*Basic Salary <= 10000 : HRA = 20%, DA = 80%
	Basic Salary <= 20000 : HRA = 25%, DA = 90%
	Basic Salary > 20000 : HRA = 30%, DA = 95%*/

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int basicSalary = scanner.nextInt();

		System.out.println("Groass Salary : "+calculateGrossSalary(basicSalary));


	}
	public static int calculateGrossSalary(int basicSalary){
		if(basicSalary<=10000){
			int calculateHRA = (basicSalary*20)/100;
			int calculateDA = (basicSalary*80)/100;
			return basicSalary+calculateDA+calculateHRA;
		}
		else if(basicSalary<=20000){
			int calculateHRA = (basicSalary*25)/100;
			int calculateDA = (basicSalary*90)/100;
			return basicSalary+calculateDA+calculateHRA;
		}
		else {
			int calculateHRA = (basicSalary*30)/100;
			int calculateDA = (basicSalary*95)/100;
			return basicSalary+calculateDA+calculateHRA;
		}
	}
}
