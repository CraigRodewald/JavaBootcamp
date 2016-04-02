package CraigRodewald;

import java.util.Scanner;

public class EvenNumberGeneratorIntoString {
	
	static Scanner scan = new Scanner(System.in);
	
	/*public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int userInput = scan.nextInt();
		
		String evenNumbersReturned = EvenNumberGenerator(userInput);
		
		System.out.println(evenNumbersReturned);
		
	}*/

	public /*static*/ String EvenNumberGenerator(int numberFromUser) {
		
		String result = "";
		String evenNumbers;
		
		if (numberFromUser < 0 || numberFromUser > 100) {
			throw new IllegalArgumentException();
		}
		for (int isItAnEvenNumber = 0; isItAnEvenNumber <= numberFromUser; isItAnEvenNumber++) {
			
			if (isItAnEvenNumber % 2 == 0) {
				evenNumbers = String.valueOf(isItAnEvenNumber);
				result += evenNumbers;
			} 
		}
		return result;
	}
}//ToDo Write the test code
