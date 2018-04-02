package examples;

abstract class Animal {
	
	public void eat() {
		System.out.println("Animal munches on some food...");
	}
	
	abstract void move();
}

/**************************************************************************/

class Dog extends Animal {
	public void move() {
		System.out.println("The dog walks around.");
	}
	
	public void beg() {
		System.out.println("The dog begs for food.");
	}
}
public class AbstractExamples {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();
		myDog.move();
		myDog.beg();
	}

}
