package Assignments;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter an integer: \n");
			
			// Use try/catch for input validation
			try {
				int x = input.nextInt();		
				
				if(x == 100) {
					break;
				} else if (x > 3) {
					System.out.println("x IS greater than 3");
				} else if (x <= 3) {
					System.out.println("x is NOT greater than 3.");
					
				}
			} catch (Exception ex) {
				System.out.println("The input is not an int!!!");
				
				// Clear the input buffer!!!!
				input.nextLine();
				// ex.printStackTrace();
				continue;
			}
			
			
			
		}
	}

}
