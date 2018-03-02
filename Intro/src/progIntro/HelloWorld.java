package progIntro;

public class HelloWorld {
	
	// Static method messages
	public static void message(String myString, int myInt) {
		System.out.println("This is my string: " + myString);
		System.out.println("This is my int: " + myInt);
	}
	
	// Main method
	public static void main(String[] args) {
		message("Hello World!", 3);
	}

}
