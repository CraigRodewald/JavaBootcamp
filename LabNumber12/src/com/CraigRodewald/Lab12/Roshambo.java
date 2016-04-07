package com.CraigRodewald.Lab12;

public class Roshambo {
	Roshambo roshambo;
	String name;

	public Roshambo(String name, Roshambo roshambo) {
		this.roshambo = roshambo;
		this.name = name;
	}

	public enum RoshamboEnum {
		ROCK, PAPER, SCISSORS
	}

	public static String toString(RoshamboEnum roshambo) {
		return roshambo.toString();
	}
}
