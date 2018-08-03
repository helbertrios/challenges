package br.net.helbert.challenges.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterChangesTest {
	
	@Test
	public void testNull() {
		final String in = null;
		final String expected = null;
		final String actual = LetterChanges.letterChanges(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testEmpty() {
		final String in = "";
		final String expected = "";
		final String actual = LetterChanges.letterChanges(in);
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test1() {
		final String in = "hello*3";
		final String expected = "Ifmmp*3";
		final String actual = LetterChanges.letterChanges(in);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		final String in = "fun times!";
		final String expected = "gvO Ujnft!";
		final String actual = LetterChanges.letterChanges(in);
		assertEquals(expected, actual);
	}

}
