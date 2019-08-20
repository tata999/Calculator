package com.training;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//import java.io.InputStreamReader;
import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare varibles
		double hoursWorked;
		double hourlyPayRate;
		double grossPay;

		// take the following variables from the user from command promt.
		System.out.print("How many hours did you work? ");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		hoursWorked = input.nextDouble();
		System.out.print("How much do you get paid per hour? ");
		hourlyPayRate = input.nextDouble();
		
		

		if (hoursWorked <= 40) {
			grossPay = hourlyPayRate * hoursWorked;
		} else {
			grossPay = hourlyPayRate * hoursWorked * 1.5;
		}
		System.out.println("You earned $" + grossPay);

		double taxes = grossPay * 0.33;
		double netPay = grossPay - taxes;
		System.out.println("Taxes are " + taxes);
		System.out.println("Your net pay is " + netPay);

	}

}
