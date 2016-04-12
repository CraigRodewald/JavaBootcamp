package com.CraigRodewald.Lab13;

public class Sheep implements Cloneable, Countable {
	int count;
	String sheepName;

	public Sheep(String string) {
		sheepName = string;
	}

	public void setSheepName(String sheepName) {
		this.sheepName = sheepName;
	}

	public String getSheepName() {
		return sheepName;
	}

	Sheep clone(String sheepName) {
		return new Sheep(sheepName);
	}

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
		return getSheepName();
	}

}
