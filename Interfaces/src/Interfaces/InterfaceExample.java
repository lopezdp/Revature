package Interfaces;

public class InterfaceExample {
	
	public static void main(String[] args) {
		Domesticated domesticatedThing = new Dog();
		
		domesticatedThing.doWork();
	}
}

interface Domesticated {
	public void doWork();
}

class Animal {
	public void eat() {
		System.out.println("I eat food.");
	}
}

class Wolf extends Animal {
	public void eat() {
		System.out.println("I eat fresh meat!");
	}
}

class Dog extends Animal implements Domesticated {
	public void eat() {
		System.out.println("I eat kibble!");
	}
	
	public void doWork() {
		System.out.println("I do tricks...");
	}
}