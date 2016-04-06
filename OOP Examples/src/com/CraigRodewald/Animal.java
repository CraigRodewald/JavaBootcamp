package com.CraigRodewald;

public class Animal {
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if (name == null) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
	
	public void speak(){
		System.out.println("Every animal speaks in it's on way");
	}
}
