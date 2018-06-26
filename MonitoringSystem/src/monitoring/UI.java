package monitoring;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	
	// UI Attributes
	private int n;
	private int a;
	private int h;
	
	
	// Default Constructor
	public UI() {};
	
	// Helper Methods
	// Display an 1st Interface to interact with user
	public int getUI(Scanner in) throws IOException {
		
		// Loop through UI Menu to obtain input with correct data type
		do {
			
			System.out.println("Welcome to the Animal Exhibit Monitoring System!\n");
			System.out.println("Please select the system to Access: ");
			System.out.println("\t 1. Monitor Animals");
			System.out.println("\t 2. Monitor Habitats");
			System.out.println("\t 3. Exit \n");
			
			System.out.println("Please enter your selection here: ");

			// Test if input is an int
			if(in.hasNextInt()) {
				// If input is an in, then assign value of input to n
				this.n = in.nextInt();
			} else {
				// If input not an int, then prompt user and consume value as a string
				// and do nothing with it. The loop will take care of consuming the
				// next round of input
				System.out.println("Invalid input. Please try again.");
				
				// This consumes the invalid input as a string
				in.next();
				
				// Continue the loop until valid input is found
				continue;
			}
			
		// While loop uses checkInput function to validate the input as an int
		// While will continue until an int is found
		} while (checkInput(1));
		
		// Return the selection to use it elsewhere as needed
		return this.n;
	}

	// Display 2nd nested Interface to interact with user
	public int getAnimalUI(Scanner in) throws IOException {
		
		// Loop through Animal Menu to obtain input with correct data type
		do {

			System.out.println("Please select the Animal to monitor: ");
			System.out.println("\t 1. Lions");
			System.out.println("\t 2. Tigers");
			System.out.println("\t 3. Bears");
			System.out.println("\t 4. Giraffes");
			System.out.println("\t 5. Back to Main Menu \n");
			
			System.out.println("Please enter your selection here: ");
			
			// Test if input is an int
			if(in.hasNextInt()) {
				// If input is an in, then assign value of input to n
				this.a = in.nextInt();
			} else {
				// If input not an int, then prompt user and consume value as a string
				// and do nothing with it. The loop will take care of consuming the
				// next round of input
				System.out.println("Invalid input. Please try again.");
				
				// This consumes the invalid input as a string
				in.next();
				
				// Continue the loop until valid input is found
				continue;
			}
			
		// While loop uses checkInput function to validate the input as an int
		// While will continue until an int is found
		} while (checkInput(2));
		
		// Return the selection to use it elsewhere as needed
		// Use this reference to store n to instance of object before returning value
		
		return this.a;
	}
	
	// Display 3rd nested Interface to interact with user
		public int getHabitatUI(Scanner in) throws IOException {
			
			// Loop through Hab Menu to obtain input with correct data type
			do {

				System.out.println("Please select the Habitat to monitor: ");
				System.out.println("\t 1. Penguin Habitat");
				System.out.println("\t 2. Bird House");
				System.out.println("\t 3. Aquarium");
				System.out.println("\t 4. Back to Main Menu \n");
				
				System.out.println("Please enter your selection here: ");
				
				// Test if input is an int
				if(in.hasNextInt()) {
					// If input is an in, then assign value of input to n
					this.h = in.nextInt();					
				} else {
					// If input not an int, then prompt user and consume value as a string
					// and do nothing with it. The loop will take care of consuming the
					// next round of input
					System.out.println("Invalid input. Please try again.");
					
					// This consumes the invalid input as a string
					in.next();
					
					// Continue the loop until valid input is found
					continue;
				}
				
			// While loop uses checkInput function to validate the input as an int
			// While will continue until an int is found
			} while (checkInput(3));
			
			// Return the selection to use it elsewhere as needed
			// Use this reference to store n to instance of object before returning value
			
			return this.h;
		}
	
	// INPUT VALIDATION METHOD
	// Check & Validate UI Input
	public boolean checkInput(int menu) {
		// Verify that input is only 1,2, or 3
		if(menu == 1) {
			// main menu Selections
			if(this.n == 1 || this.n == 2 || this.n == 3) {
				return false;
			} else {
				return true;
			}
		} else if (menu == 2) {
			// Animal Menu Selections
			if(this.a == 1 || this.a == 2  || this.a == 3 || this.a == 4|| this.a == 5) {
				return false;
			} else {
				return true;
			}
		} else if (menu == 3) {
			// Habitat Menu Selections
			if(this.h == 1 || this.h == 2 || this.h == 3 || this.h == 4) {
				return false;
			} else {
				return true;
			}
		} else {
			// prompt use of invalid input
			System.out.println("Please enter ONLY 1, 2, or 3 as your selection!!!");
			System.out.println("Please try again... \n");
			// return true to stay in loop until a valid input is found
			return true;
		}
	}

	// Exit function
	public void exitProgram() {
		System.out.println("Thank you for using our Monitoring Controls responsibly!");
		System.out.println("You will now be logged out...");
		System.out.println("Goodbye.");
		System.exit(0);
	}
	
	
	
	// Read files function
	public void readTxt(String fileName) {

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            Animal

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
