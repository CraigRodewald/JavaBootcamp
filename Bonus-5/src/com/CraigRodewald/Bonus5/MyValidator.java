package com.CraigRodewald.Bonus5;

import java.util.Scanner;

public class MyValidator extends OOValidator {

	public MyValidator(Scanner scan) {
		super(scan);
	}

	public static String getRequiredString(String prompt) {
		return ("Error! Invalid " + prompt + " value.  Try again.");
	}

	public static String getChoiceString(String prompt, String s1, String s2) {
		return ("Enter " + prompt + " between " + s1 + " and " + s2 + ": ");
	}

}
