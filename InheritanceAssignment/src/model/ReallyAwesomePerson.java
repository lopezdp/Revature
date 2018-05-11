package model;

public class ReallyAwesomePerson extends AwesomePerson {
	
	public ReallyAwesomePerson() {
		System.out.println("RAP Names.");
		
	}
	
	
	// Overload talk method
	public void talk() {
		System.out.println("RAPName: " + this.name + " RAPAge: " + this.age);
	}
	

}
