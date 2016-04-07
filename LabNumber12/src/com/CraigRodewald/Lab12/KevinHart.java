package com.CraigRodewald.Lab12;

import java.util.Random;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class KevinHart extends Player {
	Random rand;

	// TODO This is not generating a random number each time it is called
	public KevinHart() {
		rand = new Random();
		this.name = "Kevin Hart";
		this.roshambo = generateRoshambo(rand.nextInt(3) + 1);
	}

	public RoshamboEnum generateRoshambo(int choice) {
		System.out.println(choice);
		switch (choice) {
		case 1:
			return RoshamboEnum.ROCK;
		case 2:
			return RoshamboEnum.PAPER;
		default:
			return RoshamboEnum.SCISSORS;
		}
	}
}