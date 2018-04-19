package Assignments;

public class Assignment3 {
	
	/*
	 * 
	 * Write a class named Assignment3 that declares 2 
	 * strings “abc” and “abc”. The first should use 
	 * the string literal syntax and the other should 
	 * use the new keyword. Write a comparison operator 
	 * that prints a message if they are equal or otherwise. 
	 * (Use an if/else-statement)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = new String("abc");
		
		if(s1.equals(s2)) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are NOT equal");
		}
		
	}

}
