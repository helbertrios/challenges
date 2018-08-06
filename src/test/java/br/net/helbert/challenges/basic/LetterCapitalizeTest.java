package br.net.helbert.challenges.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterCapitalizeTest {
	
	
	@Test
	public void testNull() {
		
		final String in = null;
		final String expected = null;
		final String actual = LetterCapitalize.letterCapitalize(in);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testEmpty() {		
		final String in = "";
		final String expected = "";
		final String actual = LetterCapitalize.letterCapitalize(in);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSimpleWord() {		
		final String in = "helbert";
		final String expected = "Helbert";
		final String actual = LetterCapitalize.letterCapitalize(in);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSimpleSentece() {		
		final String in = "helbert vieira rios";
		final String expected = "Helbert Vieira Rios";
		final String actual = LetterCapitalize.letterCapitalize(in);
		assertEquals(expected, actual);
	}
	
	
	

}
