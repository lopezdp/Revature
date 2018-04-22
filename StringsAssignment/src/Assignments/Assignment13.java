package Assignments;

public class Assignment13 {
	
	/*
	 * 
	 * Write a class named Assignment13 that 
	 * checks if two strings are anagrams. 
	 * 
	 * Recall that an anagram is a word that 
	 * can be formed by rearranging the letters 
	 * of another. 
	 * 
	 * For example, angel is an anagram of 
	 * angle and glean. (Hint: You will have to 
	 * use the string methods that you are 
	 * familiar with along with one or more loops)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String s1 = "angel";
		String s2 = "glean";
		int counter = 0;
		try {
			for(int i = 0; i < s1.length(); i++) {
				
				for(int j = 0; j < s1.length(); j++) {
						
					if( s1.charAt(i) == s2.charAt(j)  ) {
						counter++;
					}
				}
			}
			
			if( counter == (s1.length()) ) {
				System.out.println("The two strings ARE anagrams");
			} else {
				System.out.println("The two strings ARE NOT anagrams");
			}
			
		} catch(Exception e) {
			// System.out.println("Exc: " + e);
			System.out.println("The two strings ARE NOT anagrams.");
		}
	}

}
