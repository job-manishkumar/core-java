package com.basic.ifelseprogram;

import java.util.Scanner;

public class CalculateElectricityBill {

	/*program to input electricity unit charge and calculate the total electricity bill according to the given condition:
	For first 50 units Rs. 0.50/unit
	For next 100 units Rs. 0.75/unit
	For next 100 units Rs. 1.20/unit
	For unit above 250 Rs. 1.50/unit
	An additional surcharge of 20% is added to the bill.*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int unit = scanner.nextInt();

		double bill = getElectricityBill(unit);
		double billWithServiceCharge =bill+ bill*0.20;
		System.out.println("Total electricity bill = "+billWithServiceCharge);
	}

	public static double getElectricityBill(int unit){

		if(unit<=50){
			return 50*.50;
		}
		else if(unit <=150){
			return (50*.50) + (unit-50)*.75;
		}
		else if (unit<=250) {
			return (50*.50) + (unit-50)*.75 + (unit-150)*.120;
		}
		else {
			return (50*.50) + (unit-50)*.75 + (unit-150)*.120 +(unit-250)*1.50;
		}

	}
}
