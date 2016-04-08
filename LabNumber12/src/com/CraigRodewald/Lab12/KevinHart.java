package com.CraigRodewald.Lab12;

import java.util.Random;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class KevinHart extends Player {
	Random rand = new Random();

	// TODO This is not generating a random number each time it is called
	public KevinHart() {
		this.name = "Kevin Hart";
		this.roshambo = generateRoshambo(RoshamboEnum.PAPER);
	}

	public RoshamboEnum generateRoshambo(RoshamboEnum roshambo) {
		int choice = getRandomNumber();

		switch (choice) {
		case 1:
			return RoshamboEnum.ROCK;
		case 2:
			return RoshamboEnum.PAPER;
		default:
			return RoshamboEnum.SCISSORS;
		}
	}

	public int getRandomNumber() {
		rand = new Random();
		return rand.nextInt(3) + 1;
	}
}