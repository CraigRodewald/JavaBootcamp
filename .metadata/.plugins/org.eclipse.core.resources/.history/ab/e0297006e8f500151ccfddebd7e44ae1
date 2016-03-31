import java.util.Scanner;

public class TableOfPowers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String border = "=======\t\t";
		String quit;
		
		System.out.println("Learn your squares and cubes!");
		
		do {
			System.out.print("\nEnter an integer: ");
			int integer = scan.nextInt();
			
			System.out.println("\nNumber\t\tSquared\t\tCubed\t\t");
			System.out.println(border + border + border);
			
			for (int i = 1; i < integer; i++) {
				System.out.println(i + "\t\t" + Math.pow(i, 2) + "\t\t" + Math.pow(i, 3));
			}
			
			System.out.println("\nContinue? (y/n): ");
			quit = scan.next();
			
		} while (quit.equalsIgnoreCase("y"));
		
		System.out.println("/nThank you for using Table of Powers!");
		scan.close();
	}
}
