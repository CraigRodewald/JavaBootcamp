package com.CraigRodewald.Bonus5;

public class ValidatorTestApp {
	public static void main(String[] args) {

		// Title bar
		System.out.println("Welcome to the Validation Tester application");

		// Main application logic
		System.out.println("\nInt test");
		String userNumber = MyValidator.getChoiceString("inteeger", "-100", "100");
		System.out.println(userNumber);
	}
}
