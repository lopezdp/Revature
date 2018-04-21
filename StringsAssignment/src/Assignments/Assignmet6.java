package Assignments;

public class Assignmet6 {
	
	/*
	 * 
	 * Write a class named Assignment6 that finds 
	 * the index of the 2nd space character in 
	 * "Hello My Name is Java"; 
	 * 
	 * Print this number. 
	 * 
	 * (Hint: you may have to combine two String methods)	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String s1 = "Hello My Name is Java";
		
		int counter = 0;
		
		for(int i = 0; i <= s1.length(); i++) {
			if(s1.charAt(i) == " ") {
				counter++;
				
				if(counter == 2) {
					System.out.println("Index of second space is: " + i);
				}
			}
		}
	}

}
