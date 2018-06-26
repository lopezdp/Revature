package monitoring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MonitoringSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int an;
		int hab;
		String animalFile = "animals.txt";
		String habFile = "habitats.txt";
		boolean w = true;
		
		UI ui = new UI();
		
		// Declare input variables as a Scanner object
		Scanner in = new Scanner(System.in);
		do {
			// Store user's system menu selection
			int sys = ui.getUI(in);
			
			// Do something with user input
			if(sys == 3) {
				// exit if user selects exit
				ui.exitProgram();	
				
			} else if(sys == 1) {
				an = ui.getAnimalUI(in);
				System.out.println("an: " + an);
				
				// If selection is 5 start over with UI
				if(an == 5) {
					continue;
				}
				
				// Create an Array & Read the file
				ArrayList<Animal> animals = new ArrayList<Animal>();
				
				
				// Read file and parse animals
				
				// Init an animal object for each record
				// Store in array of objects
				
				// Select animal and display data needed
				if(an == 1) {
					// Capture Lion & Display to UI
					
				} else if(an == 2) {
					// Capture Tiger & Display to UI
					
				} else if(an == 3) {
					// Capture Bear & Display to UI
					
				} else if(an == 4) {
					// Capture Giraffe & Display to UI
					
				}
			
			} else if(sys == 2) {
				hab = ui.getHabitatUI(in);
				System.out.println("hab: " + hab);
				
				// If selection is 4 start over with UI
				if(hab == 4) {
					continue;
				}
				
				// function to read file and display data needed
				
			}
		} while(w);
	}
}
