package com.CraigRodewald.bonus6;

import java.util.Scanner;

public class StudentScoresApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfStudents;
		String prompt;

		// Application title bar
		System.out.println("Welcome to the Student Scores Application!");

		prompt = "Enter the number of students: ";
		numberOfStudents = getNumberOfStudents(scan, prompt);
	}

	private static int getNumberOfStudents(Scanner scan, String prompt) {
		System.out.println(prompt);

		while (!scan.hasNextInt()) {
			scan = new Scanner(System.in);
			System.out.println("You must enter an integer.  Try again.");
			// int number = getNumberOfStudents(scan, prompt);
		}
		return scan.nextInt();
	}
}
