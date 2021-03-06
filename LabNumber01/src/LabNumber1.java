import java.util.Scanner;

public class LabNumber1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String doAgain;

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		do {
			System.out.print("\nEnter Length: ");
			double length = getUserInput(scan);

			System.out.print("Enter Width: ");
			double width = getUserInput(scan);

			System.out.print("Enter Height: ");
			double height = getUserInput(scan);

			area(length, width);
			perimeter(length, width);
			volume(length, width, height);

			System.out.print("Continue (y/n): ");
			doAgain = scan.next();

		} while (doAgain.equalsIgnoreCase("Y"));

		System.out.println("\nThank you for using my program!");

		scan.close();

	}

	private static double getUserInput(Scanner scan) {
		double userInput = scan.nextDouble();

		return userInput;
	}

	private static void volume(double length, double width, double height) {
		double volume = length * width * height;
		System.out.println("Volume: " + volume + "\n");
	}

	private static void perimeter(double length, double width) {
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter: " + perimeter);
	}

	private static void area(double length, double width) {
		double area = length * width;
		System.out.println("Area: " + area);
	}
}
