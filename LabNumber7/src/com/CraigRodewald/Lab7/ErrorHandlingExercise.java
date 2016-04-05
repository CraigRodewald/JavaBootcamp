package com.CraigRodewald.Lab7;

import java.util.Scanner;

public class ErrorHandlingExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String repeat;
		Boolean validatedNumber;
		Boolean validatedChoice;
		int number = 0;
		
		System.out.print("Welcome to the Java Class.  ");
		do {
			System.out.println("Which student would you like to learn more about?");
			
			do {
				System.out.print("(enter a number between 1-20): ");
				number = scan.nextInt();
				validatedNumber = validateNumberIsBetweenOneAndTwenty(number);
			} while (!validatedNumber);
			
			System.out.println("Student " + number + " is Kim Driscoll. What would you like to know about Kim?");
			
			do {
				System.out.print("(enter \"hometown\" or \"favorite food\"): ");
				String choice = scan.nextLine();
				validatedChoice = validateChoiceIsAnOptionGiven(choice);
			} while (!validatedChoice);
			
			System.out.println("Kim is from Detroit, MI.");
			
			System.out.print("Would you like to know more? (y/n): ");
			repeat = scan.next();
		} while (repeat.equalsIgnoreCase("y"));
		
		System.out.println("Thanks!");
		
		scan.close();
	}

	private static Boolean validateChoiceIsAnOptionGiven(String choice) {
		if (choice.equalsIgnoreCase("hometown") || choice.equalsIgnoreCase("favorite food")){
			return true;
		}
		System.out.println("That data doesn't exist. Please try again.");
		return false;
	}

	public static Boolean validateNumberIsBetweenOneAndTwenty(int number) {
		if (number >= 1 && number <= 20) {
			return true;
		}
		System.out.println("That student does not exist. Please try again.");
		return false;
	}
}
