package br.net.helbert.challenges.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestWordTest {

	@Test
	/*
	 * Input:"fun&!! time"
	 * Output:"time"
	 */
	public void test1() {		
		final String in = "fun&!! time";
		final String expected = "time";
		final String actual = LongestWord.longestWord(in);
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	
	@Test
	/*
	 * Input:"I love dogs"
	 * Output:"love"
	 */
	public void test2() {		
		final String in = "I love dogs";
		final String expected = "love";
		final String actual = LongestWord.longestWord(in);
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
