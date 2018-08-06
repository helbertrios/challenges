package br.net.helbert.challenges.basic;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

	public static String longestWord(String in) {

		final String[] arr = in.split("\\s*[^a-zA-Z0-9]+\\s*");
						
		final Comparator<String> order = new Comparator<String>() {
			public int compare(final String s1, final String s2) {
				return (s2 == null ? -1 : s2.length()) - (s1 == null ? -1 : s1.length());
			}
		};

		Arrays.sort(arr, order);
		
		return arr[0];
	}

}
