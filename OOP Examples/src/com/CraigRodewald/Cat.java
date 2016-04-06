package com.CraigRodewald;

public class Cat extends Mammal implements BushyTail {
	
	// Example of overriding
	public void speak() {
		System.out.println("meow");
	}
	
	// Example of overloading
	public void speak(String name) {
		System.out.println(name + " says " + "meow meow");
	}
}
