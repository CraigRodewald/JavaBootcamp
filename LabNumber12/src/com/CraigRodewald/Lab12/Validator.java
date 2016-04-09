package com.CraigRodewald.Lab12;

//TODO Need to validate all user inputs in this class
public class Validator {
	public static boolean stringNotNull(String string) {
		if (string.isEmpty() || string == "") {
			RoshamboApp.displayPrompt("You must enter something. Please try again.");
			return false;
		}

		return true;
	}
}
