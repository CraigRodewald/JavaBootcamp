package com.CraigRodewald.Lab13;

public class CountTestApp {
	public static void main(String[] args) {
		Alligator alligator = new Alligator();
		System.out.println("Counting Alligators...\n\n");
		CountUtil.count(alligator, 3);

		Sheep sheep = new Sheep("Blackie");
		System.out.println("\n\nCounting Sheep...\n\n");
		CountUtil.count(sheep, 2);
		Sheep sheep2 = new Sheep("Dolly");
		System.out.println();
		CountUtil.count(sheep2, 3);
		System.out.println();
		CountUtil.count(sheep, 1);
	}
}
