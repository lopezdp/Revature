package Two;

public class MainClass {
	
	public static void main(String[] args) {
		
		PrivatePerson pessoal = new PrivatePerson();
		
		pessoal.setName("Romulo");
		pessoal.setAge(29);
		
		System.out.println("Here is the name: " + pessoal.getName() + ", and this is the age: " + pessoal.getAge() + ".");
		
	}

}
