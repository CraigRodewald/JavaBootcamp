package CraigRodewald;

import java.util.Scanner;

public class EvenNumberGeneratorIntoString {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String repeat;
		
		System.out.println("Welcome to the Even Number Generator!");
		
		do {
			System.out.print("Enter a number: ");
			int userInput = scan.nextInt();
			String evenNumbersReturned = EvenNumberGenerator(userInput);
			System.out.println("\nThe even numbers are: " + evenNumbersReturned);
			System.out.print("\nContinue? (y/n) ");
			repeat = scan.next();
		} while (repeat.equalsIgnoreCase("y"));
		
		System.out.println("Thank you for trying my program.");
	}

	public static String EvenNumberGenerator(int numberFromUser) {
		
		String result = "";
		String evenNumbers;
		
		if (numberFromUser < 0 || numberFromUser > 100) {
			throw new IllegalArgumentException();
		}
		for (int isItAnEvenNumber = 0; isItAnEvenNumber <= numberFromUser; isItAnEvenNumber++) {
			
			if (isItAnEvenNumber % 2 == 0) {
				evenNumbers = String.valueOf(isItAnEvenNumber);
				result += evenNumbers;
			} 
		}
		return result;
	}
}
