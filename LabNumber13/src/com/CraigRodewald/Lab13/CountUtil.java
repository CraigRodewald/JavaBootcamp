package com.CraigRodewald.Lab13;

public class CountUtil {
	public static void count(Countable c, int maxCount) {
		c.resetCount();
		while (c.getCount() < maxCount) {
			c.incrementCount();
			System.out.println(c.getCount() + " " + c.getCountString());

		}
	}
}
