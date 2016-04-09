package com.CraigRodewald.Lab12;

import java.util.Date;
import java.util.Random;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class KevinHart extends Player {
	Random rand = new Random();

	// TODO This is not generating a random number each time it is called
	public KevinHart() {
		this.name = "Kevin Hart";
		this.roshambo = generateRoshambo();
	}

	public RoshamboEnum generateRoshambo() {
		rand.setSeed(new Date().getTime());
		int choice = rand.nextInt(3) + 1;
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