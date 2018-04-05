package PolymorphismExample;

public class Polymorphism {
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		
		// Instantiate a Dog Object as an Animal
		Animal myDog = new Dog();
		
		myDog.eat();
		
		// Calling Animal method
		System.out.println("Is my dog furry? " + myDog.hasFur);
	}
}


class Animal {
	
	public boolean hasFur = false;
	
	public void eat() {
		System.out.println("I eat meat!");
	}
}

class Dog extends Animal {
	
	public boolean hasFur = true;
	
	public void eat() {
		System.out.println("I eat kibbles and bits!");
	}
	
	public void bark() {
		System.out.println("Bow Wow Wow Yippy Yo Yippy Yay!!!");
	}
}