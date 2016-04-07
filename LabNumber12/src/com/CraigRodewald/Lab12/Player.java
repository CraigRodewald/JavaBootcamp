package com.CraigRodewald.Lab12;

import com.CraigRodewald.Lab12.Roshambo.RoshamboEnum;

abstract class Player {
	String name;
	RoshamboEnum roshambo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoshamboEnum getRoshamboValue() {
		return roshambo;
	}

	public void setRoshamboValue(RoshamboEnum roshambo) {
		this.roshambo = roshambo;
	}

	abstract public RoshamboEnum generateRoshambo(int choice);

}
