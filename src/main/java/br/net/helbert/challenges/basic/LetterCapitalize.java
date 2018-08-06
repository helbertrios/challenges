package br.net.helbert.challenges.basic;

public class LetterCapitalize {
	
	public static String letterCapitalize(final String in) {
		
		if (in == null) {
			return null;
		}
		
		String[] words = in.split(" ");
					
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 0) {
				words[i] = words[i].substring(0, 1).toUpperCase() +  words[i].substring(1);
			}
		}
				
		return String.join(" ", words);
	}


}
