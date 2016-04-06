package com.CraigRodewald.Lab9;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		String repeat;
		double radius;
		
		System.out.println("Welcome to the Circle Tester!");
		
		do {
			String prompt = "Enter radius: ";
			radius = Double.parseDouble(getResponse(scan, prompt));
			
			counter++;
			calculateCircumference(radius);
			calculateArea(radius);
			
			prompt = "Continue? (y/n)";
			repeat = getResponse(scan, prompt);
		} while (repeat.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye. You created " + counter + " Circle Object(s).");
		
	}

	private static void calculateArea(double radius) {
		double area = (Math.PI) * Math.pow(radius,2);
		
		System.out.format("Area:\t\t" + "%.2f %n", area);
		
	}

	private static void calculateCircumference(double radius) {
		double circumference = 2*(Math.PI)*radius;
		
		System.out.format("Circumference:\t" + "%.2f %n", circumference);
	}

	private static String getResponse(Scanner scan, String prompt) {
		System.out.print(prompt);
		String response = scan.nextLine();
		
		return response;
	}
}
