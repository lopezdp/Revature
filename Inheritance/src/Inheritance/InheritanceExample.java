package Inheritance;

public class InheritanceExample {
	
	public static void makeItTalk(Animal input) {
		input.speak();
	}
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		
		System.out.println("Make the Animal Object Speak: ");
		makeItTalk(myAnimal);
		
		System.out.println("Make the Dog Object Speak: ");
		makeItTalk(myDog);
	
	}

}

class Animal {
	// Speak functionality
	public void speak() {
		System.out.println("Generic Animal Noise! \n");
	}
}

class Dog extends Animal {
	
}
