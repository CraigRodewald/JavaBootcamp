
public class Practice {
	public static void main(String[] args) {
		System.out.println("If i = 10:\n");
		int i = 10;
		System.out.println("i++ =" + i++);
		System.out.println("i++ =" + i++);
		i = 10;
		System.out.println("++i =" + ++i);
		System.out.println("++i =" + ++i);
		i = 10;
		System.out.println("--i =" + --i);
		System.out.println("--i =" + --i);
		i = 10;
		System.out.println("i-- =" + i--);
		System.out.println("i-- =" + i--);
		
		System.out.println("\n\n");
		
		String a = "Craig Rodewald Clinton Township, MI";
		
		String[] splitOfA = a.split(" ");
		
		for (int j = 0; j < splitOfA.length; j++) {
			System.out.println(splitOfA[j]);
		}
	
	}
}