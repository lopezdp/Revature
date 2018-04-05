package Casting;

public class Downcasting {
	public static void main(String[] args) {
		
		// Upcasting a Dog Object to an Animal Ref type
		Animal animalRef = new Dog();
		
		// Downcasting the Dog Object referenced by animalRef into
		// a Dog typed reference variable
		Dog dogRef = (Dog) animalRef;
		// Neither operation will change the nature of the object itself
		// It always was and will always be a dog
		
		
		// This will result in a ClassCastException
		// Bird birdRef = (Bird) animalRef;
		
		// Using instanceof to check the "is-a" relationship between objects
		if(animalRef instanceof Dog) {
			dogRef = (Dog) animalRef;
		} else {
			System.out.println("animalRef does not point to a Dog object!!!");
		}
	}
}

class Animal {}
class Dog extends Animal {}
class Bird extends Animal {}
