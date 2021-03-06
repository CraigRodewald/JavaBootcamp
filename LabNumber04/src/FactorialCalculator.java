import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number;
		String repeat;
		
		System.out.println("Welcome to the Factorial Calculator!\n");
		
		do {
			int i = 0;
			System.out.print("Enter an integer between 1 and 10: ");
			number = getNumber(scan);
			
			long factorial = fact(number, i);
			
			System.out.println(factorial);
			
			System.out.print("\nPress any key to continue or 'Q' to quit.");
			repeat = userInput(scan);
		} while (!repeat.equalsIgnoreCase("q"));
	}

	private static long getNumber(Scanner scan) {
		long number = scan.nextLong();
		
		return number;
	}

	private static long fact(long number, int i) {
		
		if (number == 0) {
			return 1;
		}
		if (i<1) {
			System.out.print("!" + number + " = ");
		}
		//else if (number == i) {
			//System.out.print(number);
		//}
		else {
			System.out.print(number + " x ");
		}
		i++;
		return number * (fact(number -1, i));
		
	}

	private static String userInput(Scanner scan) {
		String userInput = scan.next();
		
		return userInput;
	}

}
