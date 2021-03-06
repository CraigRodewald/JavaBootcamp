package com.gc.tdd;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class EvenNumberGeneratorTest {

	private static final int ZERO_INPUT = 0;
	EvenNumberGenerator eng = new EvenNumberGenerator();

	@Before
	public void setup() {
		eng = new EvenNumberGenerator();
	}

	@Test
	public void mustInstantiateGenerator() {
		eng = new EvenNumberGenerator();
		assertNotNull(eng);
	}

	@Test
	public void mustReturnZeroForZeroInput() throws Exception {
		ArrayList<Integer> returnedValue = eng.generateAndGetEvenNumbers(ZERO_INPUT);
		List<Integer> expected = Arrays.asList(0);
		assertEquals("Numbers do not match", expected.get(0), returnedValue.get(0));
		assertTrue(returnedValue.size() == 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void mustThrowANExceptionForNegativeNumbers() throws Exception {
		int negativeOneInput = -1;
		eng.generateAndGetEvenNumbers(negativeOneInput);
	}

	@Test(expected = IllegalArgumentException.class)
	public void mustThrowAnExceptionForGreaterThanOneHundred() throws Exception {
		int oneHundredOneInput = 101;
		eng.generateAndGetEvenNumbers(oneHundredOneInput);
	}

	@Test
	public void mustReturnZeroAndTwoForTwoInput() throws Exception {
		int evenNumberInput = 2;
		ArrayList<Integer> actual = eng.generateAndGetEvenNumbers(evenNumberInput);
		assertAllValues(actual);
	}

	private void assertAllValues(ArrayList<Integer> actual) {
		assertTrue(actual.size() == 2);
		assertTrue(actual.get(0) == 0);
		assertTrue(actual.get(1) == 2);
	}

	@Test
	public void mustReturnZeroAndTwoForThreeInput() throws Exception {
		int evenNumberInput = 3;
		ArrayList<Integer> actual = eng.generateAndGetEvenNumbers(evenNumberInput);
		assertAllValues(actual);
	}

}
