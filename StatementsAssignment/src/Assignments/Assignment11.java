package Assignments;

public class Assignment11 {
	
	public static void main(String[] args) {
		
		int [] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < ar.length; i++) {
			
			for(int j = 1; j <= ar.length; j++) {
				System.out.println("Current count * current array index: " + (j * ar[i]));
			}
		}
	}

}
