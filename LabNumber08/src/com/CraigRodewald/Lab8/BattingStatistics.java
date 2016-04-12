package com.CraigRodewald.Lab8;

import java.util.Scanner;

public class BattingStatistics {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String anotherBatter;

		System.out.println("Welcome to Batting Average Calculator!");

		do {
			String answer = getUserStringInput(scan, "\nEnter number of times at bat: ");
			int[] atBatResult = new int[Integer.parseInt(answer)];
			System.out.println();

			displayKeyMenu();
			atBatResult = getResultsForABats(scan, answer, atBatResult);
			calculateBattingAverage(atBatResult, Integer.parseInt(answer));
			calculateSluggingAverage(atBatResult);

			anotherBatter = getUserStringInput(scan, "\nAnother batter? (y/n): ");
		} while (anotherBatter.equalsIgnoreCase("y"));
	}

	private static void calculateSluggingAverage(int[] atBatResult) {
		double numberOfBases = 0.0;

		for (int i : atBatResult) {
			numberOfBases += atBatResult[i];
		}

		double sluggingAverage = numberOfBases / atBatResult.length;

		System.out.format("Slugging Average: " + "%.3f %n", sluggingAverage);
	}

	private static void calculateBattingAverage(int[] atBatResult, int answer) {
		double battingAverage = 0.0;
		double onBaseTotal = 0;
		int attempts = answer;

		for (int i : atBatResult) {
			if (atBatResult[i] > 0) {
				onBaseTotal++;
			}
		}

		battingAverage = (onBaseTotal / attempts);

		System.out.format("Batting average: " + "%.3f %n", battingAverage);
	}

	private static int[] getResultsForABats(Scanner scan, String answer, int[] atBatResult) {
		for (int i = 0; i < Integer.parseInt(answer); i++) {
			System.out.print("Result for at-bat " + (i + 1) + ": ");
			atBatResult[i] = scan.nextInt();
		}

		return atBatResult;
	}

	private static void displayKeyMenu() {
		String[] keyMenu = { "0", "1", "2", "3", "4" };
		String[] keyTitle = { "out", "single", "double", "triple", "home run" };

		for (int i = 0; i < keyMenu.length; i++) {
			System.out.print(keyMenu[i] + "=" + keyTitle[i] + ", ");
		}
		System.out.println("");
	}

	private static String getUserStringInput(Scanner scan, String prompt) {
		System.out.print(prompt);
		String response = scan.next();

		return response;
	}
}
