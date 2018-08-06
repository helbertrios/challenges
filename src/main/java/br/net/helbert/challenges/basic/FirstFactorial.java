package br.net.helbert.challenges.basic;

public class FirstFactorial {
	
	public static int firstFactorial(final int in) {
		
		int result = 1;
		
		final int sign = Integer.signum(in);

		
		for (int i = Math.abs(in); i > 1; i--) {
			result *= i;				
		}		
		
		result *= sign;
		return result; 
	}	

}
