package com.CraigRodewald.lab15;

import java.util.List;
import java.util.Scanner;

public class CountriesApp {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] optionMenu = { "\t***Main Menu***", "\t1-List countries", "\t2-Add country", "\t3-Delete country",
				"\t4-Exit" };
		String userAnswer;

		displayPrompt("Welcome to the Countries Maintenance Application!\n");

		do {
			createMenu(optionMenu);
			displayPrompt("\n\tEnter your selection: ");
			userAnswer = getUserAnswer();
			switch (Integer.parseInt(userAnswer)) {
			case 1:
				displayAllCountries();
				break;
			case 2:
				addCountry();
				break;
			case 3:
				deleteCountry();
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
		} while (!(Integer.parseInt(userAnswer) == 4));
		scan.close();
	}

	private static void displayAllCountries() {
		System.out.println("\t\tCountry List");

		List<Country> countries = CountriesTextFile.getAll();

		if (countries == null) {
			System.out.println("\nError! Unable to get products.\n");
		} else {

			for (Country country : countries) {
				System.out.println(country);
			}

			StringBuilder sb = new StringBuilder();
			for (Country country : countries) {
				sb.append(country.getName());
				sb.append("\n");

			}
			System.out.println(sb.toString());
		}
	}

	private static String getUserAnswer() {
		return scan.next();
	}

	private static void displayPrompt(String prompt) {
		System.out.println(prompt);
	}

	private static void createMenu(String[] optionMenu) {
		for (String menuItem : optionMenu) {
			System.out.println(menuItem);
		}
	}

	public static void addCountry() {
		displayPrompt("Enter a country name: ");
		String name = getUserAnswer();

		Country countries = new Country(name);
		countries.setName(name);

		CountriesTextFile.add(countries);
		System.out.println("\n" + name + " was added to the list.\n");
	}

	public static void deleteCountry() {
		displayPrompt("Enter a country name: ");
		String name = getUserAnswer();

		Country countries = CountriesTextFile.get(name);
		if (countries == null) {
			System.out.println("\nError! Unable to get product.");
		} else {
			CountriesTextFile.delete(countries);
			System.out.println("\n" + countries.getName() + " was deleted from the list.\n");
		}
	}
}
