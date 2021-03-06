import java.util.Scanner;

public class LetterGradeConverter {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numericalGrade;
		String letterGrade;
		String repeat;
		
		System.out.println("Welcome to the Letter Grade Converter!");
		
		do {
			System.out.print("\nEnter a numerical grade: ");
			numericalGrade = getGradeNumber(scan);
			
			letterGrade = checkNumericalGrade(numericalGrade);
			System.out.println("Letter Grade: " + letterGrade);
			
			System.out.print("\nContinue? (y/n): ");
			repeat = scan.next();
		} while (repeat.equalsIgnoreCase("y"));
		System.out.println("Thanks for trying out my program!");
		
		scan.close();
	}

	private static int getGradeNumber(Scanner scan) {
		int numericalGrade = scan.nextInt();
		
		return numericalGrade;
	}

	private static String checkNumericalGrade(int grade) {
		if (grade<=100 && grade>=98 ) {
			return "A+";
		}
		else if (grade<=97 && grade>=91) {
			return "A";
		}
		else if (grade<=90 && grade>=88) {
			return "A-";
		}
		else if (grade<=87 && grade>=85) {
			return "B+";
		}
		else if (grade<=84 && grade>=83) {
			return "B";
		}
		else if (grade<=82 && grade>=80) {
			return "B-";
		}
		else if (grade<=79 && grade>=76) {
			return "C+";
		}
		else if (grade<=75 && grade>=71) {
			return "C";
		}
		else if (grade<=70 && grade>=67) {
			return "C-";
		}
		else if (grade<=66 && grade>=65) {
			return "D+";
		}
		else if (grade<=64 && grade>=63) {
			return "D";
		}
		else if (grade<=62 && grade>=60) {
			return "D-";
		}
		return "F";
	}
}
