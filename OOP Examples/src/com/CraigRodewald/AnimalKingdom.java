package com.CraigRodewald;

public class AnimalKingdom {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.setName("Fluffy");
		//cat.speak();
		
		dog.setName("Sven");
		System.out.println(dog.getName()+" is my dog's name.");
		//dog.speak();
		
		//cat.name = "Silky";  //Should avoid this way of doing it
		
		/*Cat cat2 = new Cat();
		cat2.setName("Tails");
		
		Cat cat3 = new Cat();
		cat3.setName("Kitty");

		System.out.println("My first cat's name is " + cat.getName());
		cat.speak("Tiger");
		System.out.println("My cats names are " + cat.getName() 
							+ ", " + cat2.getName() + ", and " + cat3.getName());*/
		Animal animal = new Cat();
		animal.speak();
		
		//Have to declare this implicitly because it's not sure if animals are cats
		Cat cat2 = (Cat) animal;
	
		// Example of an interface 
		BushyTail bushytail = new Cat();
		
	}
}
