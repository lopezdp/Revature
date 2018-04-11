package Assignments;

import java.util.Random;

public class Assignment10 {
	public static void main(String[] args) {
		double [] ar = new double[10];
		int rangeMin = 1;
		int rangeMax = 4;
		double randomValue = 0;
		
		for(int i = 0; i < ar.length; i++) {
			
			Random r = new Random();
			randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			
			ar[i] = randomValue;
			
			System.out.println("Output from index " + (i + 1) + ": " + ar[i]);			
		}
	}

}
