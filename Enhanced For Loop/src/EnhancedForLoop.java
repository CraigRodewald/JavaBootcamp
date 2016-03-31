
public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		String border = "======";
		System.out.println("Squared\t\tNumber\t\tCubed");
		System.out.println(border + "\t\t" + border + "\t\t" + border);
		for (int i : numbers) {
			System.out.print(i);
			System.out.print(", ");
		}
		
		System.out.println("");
		
		String[] names = {"James", "Larry", "Tom", "Lacy"};
		
		for (String name : names) {
			System.out.print(name);
			System.out.print(", ");
		}
	}
}
