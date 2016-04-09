package com.CraigRodewald.Lab12;

import java.util.Scanner;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class User extends Player {
	Scanner scan;
	boolean validation;

	public User() {
		scan = new Scanner(System.in);
	}

	public RoshamboEnum generateRoshambo() {
		RoshamboApp.displayPrompt("\n\nRock, paper, or scissors? (R/P/S): ");
		String userAnswer = RoshamboApp.getUserAnswer(scan);
		switch (userAnswer.toUpperCase()) {
		case "R":
			this.setRoshamboValue(RoshamboEnum.ROCK);
			break;
		case "P":
			this.setRoshamboValue(RoshamboEnum.PAPER);
			break;
		case "S":
			this.setRoshamboValue(RoshamboEnum.SCISSORS);
			break;

		default:
			RoshamboApp.displayPrompt("This is an invalid entry.");
			validation = false;
			break;
		}
		return roshambo;
	}

	public boolean getValidationValue() {

		return validation;

	}

}
