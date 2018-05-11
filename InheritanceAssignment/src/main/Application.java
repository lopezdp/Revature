package main;
import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {
	
	public static void main(String[] args) {
		AwesomePerson ap = new AwesomePerson();
		
		ap.talk();
		
		ReallyAwesomePerson rap = new ReallyAwesomePerson();
		rap.talk();
		
		
		
	}

}
