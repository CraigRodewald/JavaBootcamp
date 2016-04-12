package com.CraigRodewald.Bonus5;

import java.util.Scanner;

public class OOValidator {
	static Scanner scan = new Scanner(System.in);

	public OOValidator(Scanner scan) {

	}

	public static int getInt(String prompt) {
		System.out.println(prompt);
		String userNumber = scan.next();
		return Integer.parseInt(userNumber);
	}

	public static int getIntWithinRange(String prompt, int min, int max) {
		System.out.println("Enter " + prompt + " between " + min + " and " + max + ": ");
		String userNumber = scan.next();
		if (!(Integer.parseInt(userNumber) > min && Integer.parseInt(userNumber) < max)) {
			System.out.println("Invalid integer value.  Please try again");
			getIntWithinRange(prompt, min, max);
		}
		return Integer.parseInt(userNumber);
	}

	public static double getDouble(String prompt) {
		System.out.println(prompt);
		double userNumber = scan.nextDouble();
		return userNumber;
	}

	public static double getDoubleWithinRange(String prompt, double min, double max) {
		return 0;
	}
}
