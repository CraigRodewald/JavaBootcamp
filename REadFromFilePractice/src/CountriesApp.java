import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {
	static Scanner scan = new Scanner(System.in);
	static List<String> list = new ArrayList<>();
	static String fileName = "C:\\Users\\Craig\\workspace\\Grand-Circus\\JavaBootcamp\\LabNumber15\\src\\countries.txt";

	public static void main(String[] args) throws IOException {
		String[] optionMenu = { "\n\n\t***Main Menu***", "\t1-List countries", "\t2-Add country", "\t3-Delete country",
				"\t4-Exit" };
		String userAnswer;

		list = CountriesTextFile.readFromFile(fileName, list);

		displayPrompt("Welcome to the Countries Maintenance Application!");

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
				CountriesTextFile.writeToFile(fileName, list);
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
		} while (!(Integer.parseInt(userAnswer) == 4));
		scan.close();
	}

	private static void deleteCountry() {
		displayPrompt("Enter a country: ");
		String userAnswer = getUserAnswer();
		list.remove(userAnswer);
		displayPrompt(userAnswer + " was removed from the list.");

	}

	private static void addCountry() {
		displayPrompt("Enter a country: ");
		String userAnswer = getUserAnswer();
		list.add(userAnswer);
		displayPrompt(userAnswer + " was added to the list.");
	}

	private static String getUserAnswer() {
		return scan.nextLine();
	}

	private static void createMenu(String[] optionMenu) {
		for (String menuItem : optionMenu) {
			System.out.println(menuItem);
		}

	}

	private static void displayPrompt(String string) {
		System.out.println(string);
	}

	private static void displayAllCountries() {

		list.forEach(System.out::println);
	}
}
