import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String rollAnswer;
		int counter= 0;
		int diceSides;
		
		System.out.print("Welcome to the Grand Circus Casino!  ");
		
		System.out.print("How many sides do you want your dice to hace?: ");
		diceSides = getSides(scan);

		do {
			if (counter == 0) {
				System.out.print("Roll the dice? (y/n) ");
				rollAnswer = getAnswer(scan);
			}
			else {
				System.out.println("\nRoll again? (y/n) ");
				rollAnswer = getAnswer(scan);
			}
			
			if (rollAnswer.equalsIgnoreCase("y")) {
				int diceOne = rollDice(rand);
				int diceTwo = rollDice(rand);
				counter++;
				
				System.out.println("\nRoll " + counter + ":");
				System.out.println(diceOne);
				System.out.println(diceTwo);
				
				checkCraps(diceOne, diceTwo);
				checkSnakeEyes(diceOne, diceTwo);
				checkBoxCars(diceOne, diceTwo);
			} 
			
		} while (rollAnswer.equalsIgnoreCase("y"));
		
		System.out.println("Come visit the Grand Circus Casino agian, soon!");
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

	private static int rollDice(Random rand) {
		int diceValue = rand.nextInt(6)+1;
		
		return diceValue;
	}

	private static String getAnswer(Scanner scan) {
		String answer = scan.next();
		
		return answer;
	}
	
	private static int getSides(Scanner scan) {
		int answer = null;

		do {
			try {
				answer = scan.nextInt();
			}
			catch (Exception e) {
				System.out.println("That is an invalid input.\nPlease try agin.");
			} 
		}while (answer.hasNextInt());
		
		return answer;
	}
}