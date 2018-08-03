package br.net.helbert.challenges.basic;

public class LetterChanges {

	public static String letterChanges(final String in) {

		if (in == null) {
			return null;
		}

		if (in.isEmpty()) {
			return in;
		}

		StringBuilder sb = new StringBuilder(in.length());
		for (int i = 0; i < in.length(); i++) {
			Character ch = Character.toLowerCase(in.charAt(i));
			if (Character.isLetter(ch)) {
				
				if (ch.equals('z')) {
					ch = 'a';
				} else {
					ch = (char) (((int) ch)+1);
				}
				
				if (ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u')) {
					ch = Character.toUpperCase(ch);
				}
			}
			sb.append(ch);
		}

		return sb.toString();

	}


}
