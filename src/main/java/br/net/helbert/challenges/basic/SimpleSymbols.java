package br.net.helbert.challenges.basic;

public class SimpleSymbols {
	
	public static boolean simpleSymbols(final String in) {
		
		if (in == null) {
			return false;
		}
		
		char[] chars = in.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			
			char c = chars[i];
			
			if (Character.isAlphabetic(c)) {
								
				final int before = i-1;
				final int after = i+1;
				
				if (before < 0) {
					return false;
				}
				
				if (after > chars.length) {
					return false;
				}
				
				if ((chars[before] != '+') || (chars[after] != '+')) {					
					return false;
				}					
				i++;				
			}
		}
			
		return true;
	}
	

}
