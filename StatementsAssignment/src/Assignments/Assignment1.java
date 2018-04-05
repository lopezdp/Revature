package Assignments;

import java.util.*;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter an integer: \n");
			
			int num = input.nextInt();		
			
			if(num == 100) {
				break;
			} else if (num % 2 != 0) {
				System.out.println("The number: " + num + " is an ODD number. \n");
			} else if (num % 2 == 0) {
				System.out.println("The number: " + num + " is an EVEN number. \n");
				
			}
			
			
		}
		
		
	}

}
