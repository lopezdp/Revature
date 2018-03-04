package exampleData;

public class VariablesExample {
	
	public static void main(String[] args) {
		boolean myBool = false;
		byte myByte = 2;
		short myShort = 3;
		char myChar = 'b';
		int myInt = 5;
		float myFloat = 0.25f;
		long myLong = 9999999999999L;
		double myDbl = 5.999d;
		String myString = new String("This is a string object, created with a constructor");
		
		System.out.println("2 + 3 = " + (myByte + myShort));
		myBool = myInt < 6;
		System.out.println("Is myInt < 6? " + myBool);
		System.out.println("Here's some floating point division: (myDbl / myFloat)");
		System.out.println(myDbl / myFloat);
		System.out.println("But what happens when we divide integers: 5 / 2");
		System.out.println(myInt / myByte);
		System.out.println("There is no decimal and no remainder!");
		
		System.exit(0);
	}

}
