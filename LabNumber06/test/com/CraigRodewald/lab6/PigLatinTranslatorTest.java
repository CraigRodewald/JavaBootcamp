package com.CraigRodewald.lab6;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTranslatorTest {

	@Test
	public void testConvertToLowercase() {
		String result = PigLatinTranslator.convertLowercase("HELLO");
		assertEquals("hello", result);
	}
	
	@Test
	public void testWordStartsWithVowelTrue() throws Exception {
		Boolean result = PigLatinTranslator.checkIfWordStartsWithVowel("Exists");
		assertTrue(result);
	}
	
	@Test
	public void testWordStartsWithVowelFalse() throws Exception {
		Boolean result = PigLatinTranslator.checkIfWordStartsWithVowel("Hello");
		assertTrue(!result);
	}
	
	@Test
	public void testAddWayToWordStartingWithVowel() throws Exception {
		String result = PigLatinTranslator.addWayToWordStartingWitVowel("exists");
		assertEquals("existsway", result);
	}
	
	@Test
	public void testMoveConsonantsToEndOfWord() throws Exception {
		String result = PigLatinTranslator.moveConsonantsToEndOfWord("this");
		assertEquals("isth", result);
	}
	
	@Test
	public void testAddAyToEndOfWordStartingWithVowel() throws Exception {
		String result = PigLatinTranslator.addAyToWordStartingWithConsonant("this");
		assertEquals("thisay", result);
	}

}
