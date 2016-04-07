package com.CraigRodewald.Lab12;

//TODO Nedd to validate all user inputs in this class
public class Validator {
	public static boolean stringNotNull(String string) {
		if (string.isEmpty() || string == null) {
			RoshamboApp.displayPrompt("You must enter something. Please try again.");
			return false;
		}

		return true;
	}
}
