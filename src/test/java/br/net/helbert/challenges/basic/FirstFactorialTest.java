package br.net.helbert.challenges.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstFactorialTest {

	@Test
	public void testFour() {
		
		final int in = 4;
		final int expected = 24;
		final int actual = FirstFactorial.firstFactorial(in);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testEight() {
		
		final int in = 8;
		final int expected = 40320;
		final int actual = FirstFactorial.firstFactorial(in);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testZero() {
		
		final int in = 0;
		final int expected = 0;
		final int actual = FirstFactorial.firstFactorial(in);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testOne() {
		
		final int in = 1;
		final int expected = 1;
		final int actual = FirstFactorial.firstFactorial(in);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNegative() {
		
		final int in = -8;
		final int expected = -40320;
		final int actual = FirstFactorial.firstFactorial(in);
		assertEquals(expected, actual);
	}

}
