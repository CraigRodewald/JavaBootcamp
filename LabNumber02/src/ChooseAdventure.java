import java.util.Scanner;

public class ChooseAdventure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String quit = "n";
		int dragonHeads = 0;
		String weapon;

		System.out.print("Welcome, new coder!  What is your name? ");
		String name = getStringInput(scan);

		System.out.print("\nNice to meet you, " + name + "!  Would you like to play a game? (\"y\" or \"n\") ");
		String answer = getStringInput(scan);

		if (answer.equalsIgnoreCase("n")) {
			quit = "quit";
		}

		while (quit.equalsIgnoreCase("n")) {
			System.out.println(
					"\nExcellent!  You're walking home from Grand Circus and you encounter \na fire-breathing dragon! ");
			System.out.print("\nWhat do you do? (enter '1' to face the beast or '2' to run away): ");
			answer = scan.next();

			if (answer.equals("1")) {
				System.out
						.print("\nYou apporach the deagon.  You see he has __ heads. (enter \"1\", \"2\", or \"3\"): ");
				dragonHeads = scan.nextInt();
			} else {
				System.out.println("\nYou are a coward!!!\nYou ran and were saved by your mother.");
				break;
			}

			System.out.println(
					"\nNo one has ever faced a " + dragonHeads + "-headed dragon before!  Choose your weapon:");
			System.out.print("(enter '1' for a slingshot or '2' for a sword or '3' for a bow and arrow): ");
			int weaponNumber = scan.nextInt();

			switch (weaponNumber) {
			case 1:
				weapon = "slingshot";
				break;

			case 2:
				weapon = "sword";
				break;

			case 3:
				weapon = "bow and arrow";
				break;

			default:
				System.out.println("You are going in with your fists.  Not a great idea.");
				weapon = "fists";
				break;
			}

			System.out.println("\nArmed with your " + weapon
					+ ", you approach the dragon.\nYou can feel its fiery breath as you get closeer.\n\nIt stares at you with its __ eyes.");
			System.out.print("(enter '1' for red or '2' for blue): ");
			int eyeColor = scan.nextInt();

			if (eyeColor == 1) {
				System.out.println(
						"\nOh thank goodness!  Red-eyed dragons are friendly.  You pet it and become friends.");
				System.out.print("You name the dragon __. (enter a neame): ");
				String dragonName = scan.nextLine();

				System.out.println(name + " and " + dragonName + " live happily ever after!");
			} else {
				System.out.println(
						"\nBlue-eyed dragons are deadily!  Nothing you do can save you now.  You die a horrible, fiery death.");
			}

			System.out.print("\nWould you like to play again? ('y' or 'n'): ");
			quit = scan.next();
		}

		System.out.println("\nPlease play again later!");

	}

	private static String getStringInput(Scanner scan) {
		String userInput = scan.next();

		return userInput;
	}
}
