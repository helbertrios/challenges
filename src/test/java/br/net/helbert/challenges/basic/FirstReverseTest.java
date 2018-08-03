package br.net.helbert.challenges.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstReverseTest {

	@Test
	public void testNull() {
		final String in = null;
		final String expected = null;
		final String actual = FirstReverse.firstReverse(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testEmpty() {
		final String in = "";
		final String expected = "";
		final String actual = FirstReverse.firstReverse(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testWord() {
		final String in = "Life";
		final String expected = "efiL";
		final String actual = FirstReverse.firstReverse(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testSentence() {
		final String in = "Life is good.";
		final String expected = ".doog si efiL";
		final String actual = FirstReverse.firstReverse(in);
		assertEquals(expected, actual);
	}


}
