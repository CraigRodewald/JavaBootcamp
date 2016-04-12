
public class SingleSpoon {
	private static SingleSpoon theSpoon;
	private static boolean theSpoonIsAvailable = true;

	public static SingleSpoon getTheSpoon() {
		theSpoon = new SingleSpoon();
		if (!theSpoonIsAvailable) {

		}
		return theSpoon;
	}
}
