package com.CraigRodewald.praactice;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started.");
		Thread t2 = new Thread(new Task());
		t2.start();
		System.out.println(t1.getName() + " starts " + t2.getName() + " ");
		System.out.println(t1.getName() + " finished.");
	}
}
