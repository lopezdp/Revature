package Assignments;

public class Assignment5 {
	
	/*
	 * 
	 * Write a class named Assignment5 
	 * that uses the substring() method 
	 * to print the last 5 characters of 
	 * "Hello My Name is Java".
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String s1 = "Hello My Name is Java";
		
		int len = s1.length();
		
		System.out.println(s1.substring(len-5));
		
	}

}
