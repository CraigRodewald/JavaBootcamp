package com.CraigRodewald.Lab13;

public interface Countable {
	default void incrementCount() {

	}

	default void resetCount() {

	}

	default int getCount() {
		return 0;

	}

	default String getCountString() {
		return null;

	}
}
