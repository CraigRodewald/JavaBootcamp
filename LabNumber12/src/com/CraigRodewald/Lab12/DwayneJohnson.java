package com.CraigRodewald.Lab12;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

public class DwayneJohnson extends Player {

	public DwayneJohnson() {
		this.name = "Dwayne Johnson";
		this.roshambo = generateRoshambo();
	}

	public RoshamboEnum generateRoshambo() {
		return RoshamboEnum.ROCK;
	}
}
