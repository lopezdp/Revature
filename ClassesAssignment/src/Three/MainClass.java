package Three;

public class MainClass {
	
	/*
	 *  In a Main class, create an instance of Person and use their talk method. 
	 * 
	 * Place these files in a package named, “three”. 
	 */
	
	public static void main(String[] args) {
		TalkablePerson pers = new TalkablePerson();
		
		pers.setName("Dave");
		
		pers.talk();
	}

}
