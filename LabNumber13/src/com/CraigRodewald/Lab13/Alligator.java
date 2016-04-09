package com.CraigRodewald.Lab13;

public class Alligator implements Countable {
	int count;

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return "alligator";
	}

}
