package model;
import model.Person;

public class AwesomePerson extends Person {
	
	public AwesomePerson() {
		System.out.println("AP Names.");

		
	}
	
	public void talk() {
		System.out.println("Name: " + this.name + " Age: " + this.age);
	}

}
