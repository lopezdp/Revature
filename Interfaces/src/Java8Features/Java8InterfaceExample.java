package Java8Features;

import java.util.ArrayList;

public class Java8InterfaceExample {
	Domesticated myDog = new Dog();


}

interface Domesticated {
	ArrayList<String> animals = new ArrayList<>();
	ArrayList<String> plants = new ArrayList<>();
	
	Static void register(Domesticated species) {
		if(species instanceof Animal) {
			animals.add(species.getClass().getName());)
		} else if(species instanceof Plant) {
			plants.add(species.getClass.getName());
		}
	}
	
	void doWork();
	
	default void doWork(String job) {
		System.out.println("I " + job);
	}
}

abstract class Animal {};
abstract class Plant {};

class Dog extends Animal implements Domesticated {
	public void eat() {
		System.out.println("I hunt for food!");
	}
}

class Wheat extends Plant implements Domesticated {
	public void eat() {
		System.out.println("I produce large quantities of grain!");
	}
}
