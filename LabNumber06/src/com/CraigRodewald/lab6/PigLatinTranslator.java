package com.CraigRodewald.lab6;

import java.util.Scanner;

public class PigLatinTranslator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String repeat;

		System.out.println("Welcome to the Pig Latin Translator!");

		do {
			String translatedSentence = "";
			String sentence = "";
			System.out.print("\nEnter a line to be translated: ");
			System.out.println(sentence);
			sentence = "This sentence exists here";

			// sentence = scan.nextLine();

			String[] eachWordInSentence = sentence.split(" ");

			for (String word : eachWordInSentence) {
				word = convertLowercase(word);
				Boolean doesStartWithVowel = checkIfWordStartsWithVowel(word);
				if (doesStartWithVowel) {
					word = addWayToWordStartingWitVowel(word);
				} else {
					word = moveConsonantsToEndOfWord(word);
					word = addAyToWordStartingWithConsonant(word);
				}
				translatedSentence += word + " ";
			}

			System.out.println(translatedSentence);

			System.out.print("\nTranslate another line? (y/n): ");
			repeat = scan.next();
		} while (repeat.equalsIgnoreCase("y"));

		System.out.println("\nThank you for trying my Pig Latin Translator!");

		scan.close();
	}

	public static String convertLowercase(String word) {
		word = word.toLowerCase();

		return word;
	}

	// Try ignore case
	public static Boolean checkIfWordStartsWithVowel(String word) {
		char firstLetter = word.charAt(0);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		for (char letter : vowels) {
			if (letter == firstLetter) {
				return true;
			}
		}

		return false;
	}

	public static String addWayToWordStartingWitVowel(String word) {
		word += "way";

		return word;
	}

	public static String moveConsonantsToEndOfWord(String startingWord) {
		String changedWord = startingWord.substring(1, startingWord.length()) + startingWord.substring(0, 1);
		Boolean startsWithVowel = checkIfWordStartsWithVowel(changedWord);

		if (!startsWithVowel) {
			changedWord = moveConsonantsToEndOfWord(changedWord);
		}
		return changedWord;
	}

	public static String addAyToWordStartingWithConsonant(String word) {
		word += "ay";

		return word;
	}
}
