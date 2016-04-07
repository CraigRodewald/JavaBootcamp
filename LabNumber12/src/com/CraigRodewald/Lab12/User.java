package com.CraigRodewald.Lab12;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class User extends Player {

	public User() {
	}

	@Override
	public RoshamboEnum generateRoshambo(int choice) {
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
