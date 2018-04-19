package Assignments;

public class Assignment2 {
	
	/*
	 * 
	 * Write a class named Assignment2 that uses a 2 
	 * if-statement to compare the strings “abc” and “ABC”. 
	 * 
	 * The first if-statement should use the double equals (==) 
	 * operator and the other that uses the .equals() method 
	 * of one of the strings to compare to the other. 
	 * 
	 * Print a message in both if-statements to 
	 * indicate that the strings are equal
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "ABC";
		
		if(s1 == s2) {
			System.out.println("The strings are equal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("The strings are equal");
		}
		
	}

}
