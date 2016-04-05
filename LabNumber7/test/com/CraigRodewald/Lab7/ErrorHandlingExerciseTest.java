package com.CraigRodewald.Lab7;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorHandlingExerciseTest {

	@Test
	public void testReturnsFalseIfNumberGivenIsLessThanOne() {
		Boolean result = ErrorHandlingExercise.validateNumberIsBetweenOneAndTwenty(-1);
		assertEquals(false, result);
	}
	
	@Test
	public void testReturnsFalseIfNumberGivenIsGreaterThanTwenty() throws Exception {
		Boolean result = ErrorHandlingExercise.validateNumberIsBetweenOneAndTwenty(21);
		assertEquals(false, result);
	}

}
