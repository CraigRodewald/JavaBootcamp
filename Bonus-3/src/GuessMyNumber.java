import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int guess;
		String repeat;

		System.out.println("Welcome to the Guess a Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++");

		do {
			int counter = 0;
			int randomNumber = rand.nextInt(100) + 1;
			System.out.println(randomNumber);

			System.out.println("I'm thinking of a number between 1 and 100");
			do {
				System.out.print("\nEnter your lousy guess: ");
				guess = scan.nextInt();
				counter++;

				if (guess == randomNumber) {
					if (counter == 1) {
						System.out.println("You got it in " + counter + " try");
						System.out.println("You must be seriously amazing slash telepathic!");
					}
					else if (counter > 1 && counter < 5) {
						System.out.println("You're a great guesser!");
					}
					else {
						System.out.println("You got it in " + counter + " tries");
						System.out.println("Pretty good, I guess. I bet you can do better, though");
					}
					break;
				} else if (guess > randomNumber + 10) {
					System.out.println("You're crazy high, bro!  Guess again.");
				} else if (guess < randomNumber - 10) {
					System.out.println("You're crazy low, bro!  Guess again.");
				} else if (guess > randomNumber && guess < randomNumber + 10) {
					System.out.println("Too high.  Try again.");
				} else if (guess < randomNumber && guess > randomNumber - 10) {
					System.out.println("Too low, Joe.  Try again.");
				}

			} while (guess != randomNumber);
			System.out.print("Try again? (y/n): ");
			repeat = scan.next();

		} while (repeat.equalsIgnoreCase("Y"));
		scan.close();
	}
}
