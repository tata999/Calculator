package com.training;

import java.util.Scanner;

public class TimeCaluculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the starting time(in hours and minutes(Ex: 16 28)) :");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int totalminutes = x * 60 + y;

		System.out.println("Enter the duration (in minutes) :");
		int duration = input.nextInt();
		int endtime = totalminutes + duration;
		int hours = endtime / 60;
		int minutes = endtime % 60;

		System.out.println("Ending hour is  :" + hours);
		System.out.println("Ending hour is  :" + minutes);

	}

}
