package com.CraigRodewald.Lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieListApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		int[] itemNumber = { 1, 2, 3, 4, 5, 6, 7 };
		String[] itemName = { "Animated", "Drama", "Horror", "SciFi", "Comedy", "Musical" };
		String sort = null;
		String repeat;

		for (int i = 1; i <= 100; i++) {
			movieList.add(i - 1, Movie.getMovie(i));
		}
		Collections.sort(movieList, (m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
		System.out.println("Welcome to the Movie List Application!");

		System.out.println("\nThere are " + movieList.size() + " movies in this list.");

		do {
			menuGenerator(itemNumber, itemName);
			int userInput = scan.nextInt();
			switch (userInput) {
			case 1:
				sort = "animated";
				break;
			case 2:
				sort = "drama";
				break;
			case 3:
				sort = "horror";
				break;
			case 4:
				sort = "scifi";
				break;
			case 5:
				sort = "comedy";
				break;
			case 6:
				sort = "musical";
				break;

			default:
				break;
			}
			for (Movie movie : movieList) {
				if (movie.getCategory().equalsIgnoreCase(sort)) {
					System.out.println(movie.getTitle());
				}
			}
			System.out.print("\nContinue? (y/n): ");
			repeat = scan.next();
		} while (repeat.equalsIgnoreCase("y"));

		System.out.println("Thank You!");
		scan.close();
	}

	private static void menuGenerator(int[] menuItemNumber, String[] menuItemName) {

		System.out.println("\n\tWhat catagories are you interessted in?");
		for (int i = 0; i < menuItemName.length; i++) {
			System.out.println("\t\t" + menuItemNumber[i] + " = " + menuItemName[i]);
		}
	}

}
