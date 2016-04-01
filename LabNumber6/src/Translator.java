import java.util.Scanner;

public class Translator {
	public static void main(String[] args) {
		// Initialize variables and Scanner
		Scanner scan = new Scanner(System.in);
		Sentence sentence = new Sentence();
		String userSentence;
		String prompt;
		
		// Title bar
		System.out.println("Welcome to the Pig Latin Translator!");
		
		prompt = "Enter a line to be translated: ";
		userSentence = getInput(scan, prompt);
		
		Boolean beginVowel = startsWithVowel(userSentence);
		
		
	}

	private static Boolean startsWithVowel(String sentence) {
		char firstLetter;
		Boolean startsWithVowel = false;
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		firstLetter = sentence.charAt(0);
		
		for (char c : vowels) {
			if (firstLetter == c) {
				startsWithVowel = true;
			}
		}
		
		return startsWithVowel;
	}

	private static String getInput(Scanner scan, String prompt) {
		String userInput;
		
		System.out.println(prompt);
		userInput = scan.nextLine();
		
		return userInput;
	}
}
