import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String rollAnswer;
		int counter = 0;
		int diceSides;

		System.out.println("Welcome to the Grand Circus Casino!\n");

		diceSides = getSides(scan);

		do {
				rollAnswer = getAnswer(scan, counter);

			if (rollAnswer.equalsIgnoreCase("y")) {
				int diceOne = rollDice(rand, diceSides);
				int diceTwo = rollDice(rand, diceSides);
				counter++;

				System.out.println("\nRoll " + counter + ":");
				System.out.println(diceOne);
				System.out.println(diceTwo);

				checkCraps(diceOne, diceTwo);
				checkSnakeEyes(diceOne, diceTwo);
				checkBoxCars(diceOne, diceTwo);
			}

		} while (rollAnswer.equalsIgnoreCase("y"));

		System.out.println("\nCome visit the Grand Circus Casino agian, soon!");
	}

	private static void checkBoxCars(int diceOne, int diceTwo) {
		if (diceOne == 6 && diceTwo == 6) {
			System.out.println("Box Cars!");
		}
	}

	private static void checkSnakeEyes(int diceOne, int diceTwo) {
		if (diceOne == 1 && diceTwo == 1) {
			System.out.println("You rolled Snake Eyes");
		}
	}

	private static void checkCraps(int diceOne, int diceTwo) {
		if (diceOne + diceTwo == 2 || diceOne + diceTwo == 3 || diceOne + diceTwo == 12) {
			System.out.print("\n CRAPS!  ");
		}

	}

	private static int rollDice(Random rand, int sides) {
		int diceValue = rand.nextInt(sides) + 1;

		return diceValue;
	}

	private static String getAnswer(Scanner scan, int counter) {
		scan = new Scanner(System.in);
		String answer = null;
		String errorMessage = "\nYou must answer only with a 'y' or 'n'\nPlease try again\n";
		Boolean wrongAnswerPunk = true;
		
		try {
			while (wrongAnswerPunk) {
				if (counter == 0) {
					System.out.print("\nRoll the dice? (y/n) ");
				} else {
					System.out.print("\nRoll again? (y/n) ");
				}
				answer = scan.next();
				if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
					wrongAnswerPunk = false;
				}
				else {
					System.out.println(errorMessage);
				}
			}
		} catch (Exception e) {
			System.out.println(errorMessage);
			getAnswer(scan, counter);
		}

		return answer;
	}

	private static int getSides(Scanner scan) {
		scan = new Scanner(System.in);
		int sides = 0;

		try {
			System.out.print("How many sides do you want your dice to have?: ");
			sides = scan.nextInt();
		} catch (Exception e) {
			System.out.println("\nYou must enter a number.\nPlease try agin.\n");
			getSides(scan);
		}

		return sides;
	}
}
