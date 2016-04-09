package com.CraigRodewald.Lab12;

import java.util.Scanner;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class RoshamboApp {
	public static void main(String[] args) {
		// Declare and initialize variables
		int userScore = 0;
		int opponentScore = 0;
		boolean validation;
		String repeat;
		String userAnswer;
		String errorInvalid = "Invalid selection. Please try again";
		Player opponent = null;
		Scanner scan = new Scanner(System.in);
		User user = new User();

		// Display Title Bar
		displayPrompt("Welcome to Rock Paper Scissors!");

		// User enters their name
		do {
			displayPrompt("\n\nEnter your name: ");
			userAnswer = getUserAnswer(scan);
			validation = Validator.stringNotNull(userAnswer);
		} while (!validation);
		user.setName(userAnswer);

		// User selects an opponent
		do {
			validation = true;
			displayPrompt("\n\nSelect an opponent (1/2): ");
			userAnswer = getUserAnswer(scan);
			switch (Integer.parseInt(userAnswer)) {
			case 1:
				opponent = new DwayneJohnson();
				displayPrompt("Do you smell what The Rock is cooking?" + "\nYou are going up against "
						+ opponent.getName() + "!!!");
				break;
			case 2:
				opponent = new KevinHart();
				displayPrompt("Alright! ALLright! ALLRIGHT! You gon' to learn today!!" + "\nHere comes "
						+ opponent.getName() + " to ro-sham-bo the s#!t out of you!!!");
				break;
			default:
				System.out.println(errorInvalid);
				validation = false;
				break;
			}
		} while (!validation);
		do {
			opponent.generateRoshambo();
			user.generateRoshambo();
			// Display player's choice
			displayPrompt("\n" + user.getName() + ": " + Roshambo.toString(user.getRoshamboValue()));
			// Display opponent' choice
			displayPrompt("\n" + opponent.getName() + ": " + opponent.getRoshamboValue());
			int whoWon = compareRoshambos(user.getRoshamboValue(), opponent.getRoshamboValue());
			switch (whoWon) {
			case 1:
				userScore++;
				displayPrompt("\n" + user.getName() + " wins!");
				break;
			case -1:
				opponentScore++;
				displayPrompt("\n" + user.getName() + " wins!");
				break;

			default:
				displayPrompt("\nDraw!");
				break;
			}
			displayPrompt("\n\nScore:\n" + user.getName() + " = " + userScore);
			displayPrompt("\n" + opponent.getName() + " = " + opponentScore);
			displayPrompt("\n\nPlay again? (y/n): ");
			repeat = getUserAnswer(scan);
		} while (repeat.equalsIgnoreCase("y"));

		displayPrompt("\n\nThanks for playing, " + user.getName() + "!");
	}

	private static int compareRoshambos(RoshamboEnum player, RoshamboEnum opponent) {
		if (player == opponent) {
			return 0;
		}

		switch (player) {
		case ROCK:
			if (opponent.toString().equalsIgnoreCase("PAPER")) {
				return -1;
			}
			return 1;
		case PAPER:
			if (opponent.toString().equalsIgnoreCase("SCISSORS")) {
				return -1;
			}
			return 1;
		case SCISSORS:
			if (opponent.toString().equalsIgnoreCase("ROCK")) {
				return -1;
			}
			return 1;

		default:
			break;
		}

		return 0;
	}

	public static String getUserAnswer(Scanner scan) {
		return scan.nextLine();
	}

	public static void displayPrompt(String prompt) {
		System.out.print(prompt);
	}

}
