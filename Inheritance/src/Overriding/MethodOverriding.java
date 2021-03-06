package Overriding;

public class MethodOverriding {
	
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
		
		myDog.chaseAmbulance();
	
	}

}

class Animal {
	// Speak functionality
	public void speak() {
		System.out.println("Generic Animal Noise! \n");
	}
}

class Dog extends Animal {
	// Method Overriding for speak method!!
	// Speak functionality
	public void speak() {
		System.out.println("Woof! Woof! \n");
	}
	
	public void chaseAmbulance() {
		System.out.println("Dog chases ambulance for 5 blocks!!");
		super.speak();
	}
	
}