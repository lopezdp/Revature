package One;


public class Application {
	
	/*
	 * 
	 * Write another class, Application, 
	 * in which you instantiate a new Person object. 
	 * Set the person’s age and name properties. Print the 
	 * age and name properties of the created person.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "David";
		p.age = 29;
		
		System.out.println("The person's name is " + p.name + " and his age is " + p.age + ".");
		
	}

}
