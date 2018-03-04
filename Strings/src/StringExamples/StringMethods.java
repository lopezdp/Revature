package StringExamples;

public class StringMethods {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("Hello");
		
		System.out.println("String length:\t\t" + str1.length());
		System.out.println("String to Upper:\t\t" + str1.toUpperCase());
		System.out.println("String to Lower:\t\t" + str1.toLowerCase());
		System.out.println("String index of 'e':\t\t" + str1.indexOf('e'));
		System.out.println("String last index of 'l':\t" + str1.lastIndexOf('l'));
		System.out.println("String char at 4:\t\t" + str1.charAt(4));
		System.out.println("\nString1 equals String2:\t\t" + str1.equals(str2));
		System.out.println("String1 equals ignore case String2:\t" + str1.equalsIgnoreCase(str2));
	}

}
