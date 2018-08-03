package br.net.helbert.challenges.basic;

public class FirstReverse {
	
	public static String firstReverse(String in) { 
		
		if (in ==null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder(in);
		return sb.reverse().toString();	
	}
	
}
