package com.training;

public class CelToFo{
 
	

	 public static void main (String[] args)
	 {
	   // Celsius temp is a constant
	   // Fahrenheit temp

	   final double CELS = 37;
	   double FAHR;

	// calculate Fahrenheit temp using formula
	   FAHR = CELS * (9/5)+32;
	

	   System.out.println("This program converts Celsius to Fahrenheit");
	   // display the result

	   System.out.println("Celsius Temp = " + CELS);
	   System.out.println("Fahrenheit Temp = " + FAHR);

	   // display end message
	   System.out.println("End of program");
	 }
	}


