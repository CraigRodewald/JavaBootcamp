package com.CraigRodewald.Lab12;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class DwayneJohnson extends Player {

	public DwayneJohnson() {
		this.name = "Dwayne Johnson";
		this.roshambo = generateRoshambo(1);
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
