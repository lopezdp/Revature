package Assignments;

import java.util.Scanner;

public class Assignment6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter an float: \n");
			
			// Use try/catch for input validation
			try {
				float x = input.nextFloat();		
				
				if(x == 100) {
					break;
				} else if (x == 3) {
					System.out.println("x IS equal to 3");
				} else if (x > 5) {
					System.out.println("x IS greater than 5");
				} else if (x <= 0) {
					System.out.println("x IS less than or equal to zero");
				} else {
					System.out.println("x is none of the other options");
					
				}
			} catch (Exception ex) {
				System.out.println("The input is not a float!!!");
				
				// Clear the input buffer!!!!
				input.nextLine();
				// ex.printStackTrace();
				continue;
			}
			
			
			
		}
	}

}
