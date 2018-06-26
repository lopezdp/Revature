package monitoring;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	
	// UI Attributes
	private int n;
	private int a;
	private int h;
	private ArrayList<Animal> animalList;
	private ArrayList<Habitat> habitatList;
	
	// Default Constructor
	public UI() {};
	
	/**
	 * @return the animalList
	 */
	public ArrayList<Animal> getAnimalList() {
		return animalList;
	}

	/**
	 * @param animalList the animalList to set
	 */
	public void setAnimalList(ArrayList<Animal> animalList) {
		this.animalList = animalList;
	}

	// Accessor & Mutator methods for private variables
	/**
	 * @return the habitatList
	 */
	public ArrayList<Habitat> getHabitatList() {
		return habitatList;
	}

	/**
	 * @param animalList the animalList to set
	 */
	public void setHabitatList(ArrayList<Habitat> habitatList) {
		this.habitatList = habitatList;
	}
	
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
	public void parseTxtData(String fileName) {
				
		// new line count between segments of data
		int spaceCount = 0;
		int anCount = 0;
		int anDataCount = 0;
		int habCount = 0;
		
        // This will reference one line at a time
        String line = null;

        // Create a local array to store object as they are created
        // Goal is to create objects as each line of data is read
        // Once max objects created based on input, program
        // should just proceed by added remaining data to the 
        // respective object.        
        // Hopefully this is efficient O(N)
        ArrayList<Animal> anAr = new ArrayList<Animal>();
        ArrayList<Habitat> habAr = new ArrayList<Habitat>();
        
        // Start reading file - if it exists 
        // Create objects as file is read
        try {
            // FileReader reads text files using the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // If the file need is animal use 1st condition
            // else its a habitat
            if(fileName == "animals.txt") {
            	
            	
            	// Loop through contents of txt file
            	while((line = bufferedReader.readLine()) != null) {
            		
                    
                    // Need to get titles first. Segment of titles exist before 1st empty line
                    if(spaceCount < 1) {
                    	//increment animal counter on every iteration
                		anCount++;
                		
                    	// for each title create a new animal object with the default
                    	// constructor and add the title if in 1st data segment
                    	Animal an = new Animal();
                    	
                    	// Check to see if line is a blank \n or if it has data
                    	// set the title of each object through the first segment of data in file
                    	if(line == "\n") {
                    		System.out.println("should be blank" + line);
                    		// if line is \n then increment space count to 
                    		// signal the termination of the current segment
                    		// of data
                    		spaceCount++;
                    		
                    	} else {
                    		System.out.println("should be title" + line);
                    		// else, if line has title data still, then
                    		// set the title of the object with data from the file
                    		an.setTitle(line);
                    		anAr.add(an);
                    	}
                    	
                    	// If spaceCount has been incremented by 1 then user is in the
                    	// 2nd segment of data which should be the first animal in the list
                    	// each line will be a data point for the object
                    } else if(spaceCount >= 1 && spaceCount < 2) {
                    	// increment the line count data placeholder for the
                    	// 2nd data segment and store data in each object
                    	// property
                    	anDataCount++;
                    	
                    	// Check to see if line is a blank \n or if it has data
                    	// set the property values for each object through the 
                    	// 2nd segment of data in file
                    	if(line == "\n") {
                    		System.out.println("should be blank" + line);
                    		// if line is \n then increment space count to 
                    		// signal the termination of the current segment
                    		// of data
                    		spaceCount++;
                    		
                    	} else if(anDataCount == 1) {
                    		anAr.get(0).setSpecies(line);
                    		
                    	} else if(anDataCount == 2) {
                    		anAr.get(0).setName(line);
                    		
                    	} else if(anDataCount == 3) {
                    		anAr.get(0).setAge(Integer.parseInt(line));
                    		
                    	} else if(anDataCount == 4) {
                    		anAr.get(0).setHealth(line);
                    		
                    	} else if (anDataCount == 5) {
                    		anAr.get(0).setFeedSched(line);
                    		// resent the segment data counter & prep for reuse
                        	anDataCount = 0;                    		
                    	}
                    	
                    	
                    } else if(spaceCount >= 2 && spaceCount < 3) {
                    	// increment the line count data placeholder for the
                    	// 3rd data segment and store data in each object
                    	// property
                    	anDataCount++;
                    	
                    	// Check to see if line is a blank \n or if it has data
                    	// set the property values for each object through the 
                    	// 3rd segment of data in file
                    	if(line == "\n") {
                    		System.out.println("should be blank" + line);
                    		// if line is \n then increment space count to 
                    		// signal the termination of the current segment
                    		// of data
                    		spaceCount++;
                    		
                    	} else if(anDataCount == 1) {
                    		anAr.get(1).setSpecies(line);
                    		
                    	} else if(anDataCount == 2) {
                    		anAr.get(1).setName(line);
                    		
                    	} else if(anDataCount == 3) {
                    		anAr.get(1).setAge(Integer.parseInt(line));
                    		
                    	} else if(anDataCount == 4) {
                    		anAr.get(1).setHealth(line);
                    		
                    	} else if (anDataCount == 5) {
                    		anAr.get(1).setFeedSched(line);
                    		// resent the segment data counter & prep for reuse
                        	anDataCount = 0;                    		
                    	}
                    	
                    } else if(spaceCount >= 3 && spaceCount < 4) {
                    	// increment the line count data placeholder for the
                    	// 4th data segment and store data in each object
                    	// property
                    	anDataCount++;
                    	
                    	// Check to see if line is a blank \n or if it has data
                    	// set the property values for each object through the 
                    	// 4th segment of data in file
                    	if(line == "\n") {
                    		System.out.println("should be blank" + line);
                    		// if line is \n then increment space count to 
                    		// signal the termination of the current segment
                    		// of data
                    		spaceCount++;
                    		
                    	} else if(anDataCount == 1) {
                    		anAr.get(2).setSpecies(line);
                    		
                    	} else if(anDataCount == 2) {
                    		anAr.get(2).setName(line);
                    		
                    	} else if(anDataCount == 3) {
                    		anAr.get(2).setAge(Integer.parseInt(line));
                    		
                    	} else if(anDataCount == 4) {
                    		anAr.get(2).setHealth(line);
                    		
                    	} else if (anDataCount == 5) {
                    		anAr.get(2).setFeedSched(line);
                    		// resent the segment data counter & prep for reuse
                        	anDataCount = 0;                    		
                    	}
                    	
                    } else if(spaceCount >= 4 && spaceCount < 5) {
                    	// increment the line count data placeholder for the
                    	// 5th data segment and store data in each object
                    	// property
                    	anDataCount++;
                    	
                    	// Check to see if line is a blank \n or if it has data
                    	// set the property values for each object through the 
                    	// 5th segment of data in file
                    	if(line == "\n") {
                    		System.out.println("should be blank" + line);
                    		// if line is \n then increment space count to 
                    		// signal the termination of the current segment
                    		// of data
                    		spaceCount++;
                    		
                    	} else if(anDataCount == 1) {
                    		anAr.get(3).setSpecies(line);
                    		
                    	} else if(anDataCount == 2) {
                    		anAr.get(3).setName(line);
                    		
                    	} else if(anDataCount == 3) {
                    		anAr.get(3).setAge(Integer.parseInt(line));
                    		
                    	} else if(anDataCount == 4) {
                    		anAr.get(3).setHealth(line);
                    		
                    	} else if (anDataCount == 5) {
                    		anAr.get(3).setFeedSched(line);
                    		// resent the segment data counter & prep for reuse
                        	anDataCount = 0;                    		
                    	}
                    	
                    }
                    
                }

            	// needed later place holding for now
            	this.setAnimalList(anAr);
            	
            	
            	
            } else {
                this.setHabitatList(new ArrayList<Habitat>());
                
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
