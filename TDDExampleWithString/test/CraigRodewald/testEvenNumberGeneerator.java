package CraigRodewald;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testEvenNumberGeneerator {
	
	EvenNumberGeneratorIntoString engis = new EvenNumberGeneratorIntoString();
	
	@Before
	public void setup() throws Exception {
		engis = new EvenNumberGeneratorIntoString();
	}
	
	@Test
	public void mustInstantiateGenerator() {
		engis = new EvenNumberGeneratorIntoString();
		assertNotNull(engis);
	}

	@Test
	public void testReturnZeroIfZeroIsGiven() throws Exception {
		engis = new EvenNumberGeneratorIntoString();
		String result = EvenNumberGeneratorIntoString.EvenNumberGenerator(0);
		assertEquals("Number doesn't match", "0", result);
	}
	
	@Test
	public void testReturnZeroAndTwoIfTwoIsGiven() throws Exception {
		engis = new EvenNumberGeneratorIntoString();
		String result = engis.EvenNumberGenerator(2);
		assertEquals("Numbers don't match", "02", result);
	}
	
	@Test
	public void testReturnZeroAndTwoIfThreeIsGiven() throws Exception {
		engis = new EvenNumberGeneratorIntoString();
		String result = engis.EvenNumberGenerator(3);
		assertEquals("Numbers don't match", "02", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testThrowsAnExceptionForNegativeNumbers() throws Exception {
		engis = new EvenNumberGeneratorIntoString();
		engis.EvenNumberGenerator(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testThrowsAnExceptionForGreaterThanOneHunderd() throws Exception {
		engis = new EvenNumberGeneratorIntoString();
		engis.EvenNumberGenerator(101);
	}
}
