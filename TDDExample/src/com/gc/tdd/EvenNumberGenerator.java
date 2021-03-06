package com.gc.tdd;

import java.util.ArrayList;

public class EvenNumberGenerator {

	public ArrayList<Integer> generateAndGetEvenNumbers(int i) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		if (i < 0 || i > 100) {
			throw new IllegalArgumentException();
		}
		
		for (int isEvenNumber = 0; isEvenNumber <= i; isEvenNumber++) {
			
			if (isEvenNumber%2 == 0) {
				results.add(isEvenNumber);
			}
		
		}
		
		return results;
	}

}
