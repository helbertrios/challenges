package br.net.helbert.challenges.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleAddingTest {

	@Test
	public void testZero() {
		final int in = 0;
		final int expected = 0;
		final int actual = SimpleAdding.simpleAdding(in);		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOne() {
		final int in = 1;
		final int expected = 1;
		final int actual = SimpleAdding.simpleAdding(in);		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOneNegative() {
		final int in = -1;
		final int expected = -1;
		final int actual = SimpleAdding.simpleAdding(in);		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFour() {
		final int in = 4;
		final int expected = 10;
		final int actual = SimpleAdding.simpleAdding(in);		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOneHundred() {
		final int in = 100;
		final int expected = 5050;
		final int actual = SimpleAdding.simpleAdding(in);		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOneHundredNegative() {
		final int in = -100;
		final int expected = -5050;
		final int actual = SimpleAdding.simpleAdding(in);		
		assertEquals(expected, actual);
	}
	
	
	

}
