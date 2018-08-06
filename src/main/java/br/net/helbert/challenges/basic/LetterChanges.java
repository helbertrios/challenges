package br.net.helbert.challenges.basic;

public class LetterChanges {

	public static String letterChanges(final String in) {

		if (in == null) {
			return null;
		}

		char[] arr = in.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			final int c = arr[i];

			if ((c > 64 && c < 91) || (c > 96 && c < 123)) {
				int nc = c;
				if ((c == 90) || (c == 122)) {
					nc = 65;
				} else {
					nc = c + 1;
					if ((nc == 101) || (nc == 105) || (nc == 111) || (nc == 117)) {
						nc = nc - 32;
					}
				}
				arr[i] = (char) nc;
			}
		}
		
		return new String(arr);

	}

}
