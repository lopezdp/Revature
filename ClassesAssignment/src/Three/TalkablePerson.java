package Three;

public class TalkablePerson {
	
	/*
	 * 
	 * Write a class named TalkablePerson 
	 * that declares a public talk() method 
	 * along with name (String) and age (int) properties. 
	 * 
	 * The talk() method should have a void return 
	 * type and print the message, “Hello my name is: {name}”. 
	 * 
	 * Instead of {name} the person’s name property should be printed. 
	 * 
	 * In a Main class, create an instance of Person and use their talk method. 
	 * 
	 * Place these files in a package named, “three”. 
	 */
	
	String name;
	
	public void talk() {
		System.out.println("Hello my name is: " + this.name + "."); 
	}
	
	public void setName(String n) {
		this.name = n;
	}

}
