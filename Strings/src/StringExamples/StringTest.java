package StringExamples;

public class StringTest {
	public static void main(String[] args) {
		String strA = "Hello";
		String strB = new String("Hello");
		
		System.out.println("String A: " + strA);
		System.out.println("String B: " + strB);
		
		if(strA == strB) {
			System.out.println("strA and strB point to the same Object!");
		} else {
			System.out.println("strA and strB DO NOT point to the same Object!");
		}
	}

}
